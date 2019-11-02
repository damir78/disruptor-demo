package com.teivah.disruptor;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;

import java.util.ArrayList;
import java.util.List;

public class Demo5Fix {

    public static void main(String[] args) {
        new Demo5Fix().demo();
    }

    private void demo() {

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            strings.add("Blah " + i);
        }

        EventHandler<Event<String>> handler = (event, sequence, endOfBatch) -> {
            System.out.println("Consumer 1: " + event.getPayload());
            event.setThreadName(Thread.currentThread().getName());
            event.setHandlerName(System.nanoTime() + " blah");
            Thread.sleep(500);
        };

        //collect events here.
        CollectEventHandler<String> collectEventHandler = new CollectEventHandler<>();

        Disruptor<Event<String>> disruptor = new Disruptor<>(Event::new, 128, DaemonThreadFactory.INSTANCE, ProducerType.SINGLE, new BlockingWaitStrategy());
        disruptor.handleEventsWith(handler, collectEventHandler);
        RingBuffer<Event<String>> ringBuffer = disruptor.start();

        for (String string : strings) {
            final long sequence = ringBuffer.next();
            final Event<String> event = ringBuffer.get(sequence);
            event.setPayload(string);
            ringBuffer.publish(sequence);
            //System.out.println("process initial data = " + event);
        }

        //VERY IMPORTANT
        while (ringBuffer.getBufferSize() - ringBuffer.remainingCapacity() != 0) {
            // Wait for priocessing...
        }

        disruptor.halt();
        disruptor.shutdown();
        for (Event<String> stringEvent : collectEventHandler.getCollectedEvents()) {
            System.out.println(stringEvent);
        }
    }
}