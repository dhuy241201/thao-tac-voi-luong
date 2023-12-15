package Th_taoLuong_bang_Runable;

public class Main {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread1");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread2");
        runnableDemo2.start();
        System.out.println("Main thread stopped!!");
    }
}
