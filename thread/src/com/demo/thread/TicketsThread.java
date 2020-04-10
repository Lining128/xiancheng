package com.demo.thread;

class MyThread extends Thread{
    private int ticketsCont = 5;
    private String name ;

    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run(){
        while (ticketsCont > 0){
            ticketsCont--;
            System.out.println(name + "卖了1张票，剩余票数为：" + ticketsCont);
        }
    }
}
public class TicketsThread {
    public static void main(String[] args) {
        //创建三个线程
        MyThread mt1 = new MyThread("窗口1");
        MyThread mt2 = new MyThread("窗口2");
        MyThread mt3 = new MyThread("窗口3");
        //启动三个线程
        mt1.start();
        mt2.start();
        mt3.start();

    }
}
