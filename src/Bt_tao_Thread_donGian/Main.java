package Bt_tao_Thread_donGian;

public class Main {
    public static void main(String[] args) {
        NumberGenerator obj1 = new NumberGenerator("One -");
        NumberGenerator obj2 = new NumberGenerator("Two -");
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
//        thread1.setPriority(Thread.MAX_PRIORITY);
//        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        System.out.println("Danh sách 10 số tự nhiên đầu tiên:");
    }
}
