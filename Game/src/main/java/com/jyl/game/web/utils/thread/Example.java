package com.jyl.game.web.utils.thread;

import org.junit.Test;

/**
 * @Auther: pc
 * @Date: 2019-08-18 14:35
 * @Description:
 */
public class Example extends Thread {

     volatile  boolean stop = false;

    public void example(boolean temp) throws Exception {
        Example thread = new Example();
        thread.start();
        thread.stop = temp;
        thread.interrupt();
    }

    public void run() {
        while (!stop) {
            System.out.println("Thread running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread exiting under request...");
        }
    }
}
