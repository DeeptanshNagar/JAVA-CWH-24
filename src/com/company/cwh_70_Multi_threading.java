package com.company;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I m Happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i<40000){
            System.out.println("Thread2 for Chatting with her");
            System.out.println("I m Sad!");
            i++;
        }
    }
}
public class cwh_70_Multi_threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
