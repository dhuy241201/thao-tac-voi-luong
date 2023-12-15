package Bt_hienThi_so_chanLe;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddthread = new OddThread();
        EvenThread eventhread = new EvenThread();
        oddthread.start();
        try {
            oddthread.join();
        } catch (Exception e) {
            System.out.println("Chương trình bị lỗi");
        }
        eventhread.start();
        try {
            eventhread.join();
        } catch (Exception e) {
            System.out.println("Chương trình bị lỗi");
        }
        System.out.println("Chương trình kết thúc");
    }
}
