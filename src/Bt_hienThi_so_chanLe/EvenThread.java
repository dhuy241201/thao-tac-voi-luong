package Bt_hienThi_so_chanLe;

public class EvenThread extends Thread{
    int count = 1;
    public EvenThread(){}

    @Override
    public void run() {
        try{
            for (int i=1; i<=10; i++){
                if (i % 2 == 0){
                    System.out.println("Số chẵn thứ " + count + ": " + i);
                    count++;
                    Thread.sleep(15);
                }
            }
        }catch (Exception e){
            System.out.println("Chương trình đã dừng lại");
        }
    }
}
