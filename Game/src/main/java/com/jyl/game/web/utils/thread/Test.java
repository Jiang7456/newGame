package com.jyl.game.web.utils.thread;

/**
 * @Auther: pc
 * @Date: 2019-08-18 19:04
 * @Description:
 */
public class Test {

    volatile  boolean f = false ; // True 时线程1执行

    public static void main(String[] args) {
    }

  class Thread1 extends Thread{
      @Override
      public void run() {
          while (f){

          }
      }
  }
}
