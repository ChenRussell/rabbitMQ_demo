package com.RabbitMQ.demo.v2;

import java.io.IOException;

public class Test {
	
	public static void init_mq() throws Exception{
		
		Receiver receiver = new Receiver("testQueue");
        Thread receiverThread = new Thread(receiver);
        receiverThread.start();
//        Sender sender = new Sender("testQueue");
		
	}
	
    public static void main(String[] args) throws Exception{
//        Receiver receiver = new Receiver("testQueue");
//        Thread receiverThread = new Thread(receiver);
//        receiverThread.start();
//        Sender sender = new Sender("testQueue");
    	Test.init_mq();
    	Sender sender = new Sender("testQueue");
        for (int i = 0; i < 5000; i++) {
        	Thread.sleep(1000);
            MessageInfo messageInfo = new MessageInfo();
            messageInfo.setChannel("test");
            messageInfo.setContent("msg" + i);
            sender.sendMessage(messageInfo);
        }
    }
}
