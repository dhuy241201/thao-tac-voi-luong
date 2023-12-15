package Bt_hienThi_so_chanLe;

public class OddThread extends Thread{
    int count = 1;
    public OddThread(){}

    @Override
    public void run() {
        try{
            for (int i=1; i<=10; i++){
                if (i % 2 != 0){
                    System.out.println("Số lẻ thứ " + count + ": " + i);
                    count++;
                    Thread.sleep(10);
                }
            }
        }catch (Exception e){
            System.out.println("Chương trình đã dừng lại");
        }
    }
}
