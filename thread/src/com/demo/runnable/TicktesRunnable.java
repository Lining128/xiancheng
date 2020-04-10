package com.demo.runnable;

class MyThread implements Runnable{
    private int ticketsCont = 5;
    @Override
    public void run(){
        while (ticketsCont > 0){
            ticketsCont--;
            System.out.println(Thread.currentThread().getName() + "卖了1张票，剩余票数为：" + ticketsCont);
        }
    }
}

public class TicktesRunnable {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //创建三个线程
        Thread th1 = new Thread(mt,"窗口一");
        Thread th2 = new Thread(mt,"窗口二");
        Thread th3 = new Thread(mt,"窗口三");
        //启动线程
        th1.start();
        th2.start();
        th3.start();
    }
}
