-- Sample output of Demo4:
Something is wrong!! I've expected that all events are fille with thread name information and additional timestamp info.

It looks that not all events processed by disruptor. Bug??


Consumer 1: Blah 0
Consumer 1: Blah 1
Consumer 1: Blah 2
Consumer 1: Blah 3
Consumer 1: Blah 4
Consumer 1: Blah 5
Consumer 1: Blah 6
Consumer 1: Blah 7
Consumer 1: Blah 8
Consumer 1: Blah 9
Consumer 1: Blah 10
Consumer 1: Blah 11
Consumer 1: Blah 12
Consumer 1: Blah 13
Consumer 1: Blah 14
Consumer 1: Blah 15
Event(payload=Blah 0, threadName=Thread-0, handlerName=29096206289976 blah)
Event(payload=Blah 1, threadName=Thread-0, handlerName=29096706538142 blah)
Event(payload=Blah 2, threadName=Thread-0, handlerName=29097206741344 blah)
Event(payload=Blah 3, threadName=Thread-0, handlerName=29097706961137 blah)
Event(payload=Blah 4, threadName=Thread-0, handlerName=29098207169938 blah)
Event(payload=Blah 5, threadName=Thread-0, handlerName=29098707370164 blah)
Event(payload=Blah 6, threadName=Thread-0, handlerName=29099207752933 blah)
Event(payload=Blah 7, threadName=Thread-0, handlerName=29099708122437 blah)
Event(payload=Blah 8, threadName=Thread-0, handlerName=29100208473116 blah)
Event(payload=Blah 9, threadName=Thread-0, handlerName=29100708681947 blah)
Event(payload=Blah 10, threadName=Thread-0, handlerName=29101209102798 blah)
Event(payload=Blah 11, threadName=Thread-0, handlerName=29101709320676 blah)
Event(payload=Blah 12, threadName=Thread-0, handlerName=29102209540849 blah)
Event(payload=Blah 13, threadName=Thread-0, handlerName=29102709750181 blah)
Event(payload=Blah 14, threadName=Thread-0, handlerName=29103209958291 blah)
Event(payload=Blah 15, threadName=Thread-0, handlerName=29103710150881 blah)
Event(payload=Blah 16, threadName=null, handlerName=null)
Event(payload=Blah 17, threadName=null, handlerName=null)
Event(payload=Blah 18, threadName=null, handlerName=null)
Event(payload=Blah 19, threadName=null, handlerName=null)
Event(payload=Blah 20, threadName=null, handlerName=null)
Event(payload=Blah 21, threadName=null, handlerName=null)
Event(payload=Blah 22, threadName=null, handlerName=null)
Event(payload=Blah 23, threadName=null, handlerName=null)
Event(payload=Blah 24, threadName=null, handlerName=null)
Event(payload=Blah 25, threadName=null, handlerName=null)
Event(payload=Blah 26, threadName=null, handlerName=null)
Event(payload=Blah 27, threadName=null, handlerName=null)
Event(payload=Blah 28, threadName=null, handlerName=null)
Event(payload=Blah 29, threadName=null, handlerName=null)
Event(payload=Blah 30, threadName=null, handlerName=null)
Event(payload=Blah 31, threadName=null, handlerName=null)
Event(payload=Blah 32, threadName=null, handlerName=null)
Event(payload=Blah 33, threadName=null, handlerName=null)
Event(payload=Blah 34, threadName=null, handlerName=null)
Event(payload=Blah 35, threadName=null, handlerName=null)
Event(payload=Blah 36, threadName=null, handlerName=null)
Event(payload=Blah 37, threadName=null, handlerName=null)
Event(payload=Blah 38, threadName=null, handlerName=null)
Event(payload=Blah 39, threadName=null, handlerName=null)
Event(payload=Blah 40, threadName=null, handlerName=null)
Event(payload=Blah 41, threadName=null, handlerName=null)
Event(payload=Blah 42, threadName=null, handlerName=null)
Event(payload=Blah 43, threadName=null, handlerName=null)
Event(payload=Blah 44, threadName=null, handlerName=null)
Event(payload=Blah 45, threadName=null, handlerName=null)
Event(payload=Blah 46, threadName=null, handlerName=null)
Event(payload=Blah 47, threadName=null, handlerName=null)
Event(payload=Blah 48, threadName=null, handlerName=null)
Event(payload=Blah 49, threadName=null, handlerName=null)

Process finished with exit code 0


alsi -a

                  +			OS: Arch Linux x86_64
                  #			Hostname: hpc
                 ###			Uptime: 8:27, 40 sec
                #####			Kernel: 5.2.14-arch2-1-ARCH
                ######			Shell: /bin/bash
               ; #####;			Packages: 1490
              +##.#####			Window Manager: Unknown
             +##########		GTK2 theme: Numix-Frost-Light
            #############;		GTK2 icon theme: Numix
           ###############+		GTK2 font name: Lato 11
          #######   #######		RAM: 9297M / 64340M (14%)
        .######;     ;###;`".		SWAP: 0M / 32172M (0%)
       .#######;     ;#####.		CPU: AMD Ryzen Threadripper 2950X 16-Core Processor
       #########.   .########`		Boot: 62M / 488M (14%) (ext4)
      ######'           '######		Efi: 392K / 511M (1%) (vfat)
     ;####                 ####;	Root: 131G / 437G (32%) (ext4)
     ##'                     '##
    #'                         `#
