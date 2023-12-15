package Bt_tao_Thread_donGian;

public class NumberGenerator implements Runnable{
    private String name;
    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                System.out.println("Thread: "+ this.name + " " + i);
                System.out.println(this);
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Chương trình đã dừng lại");
            }
        }
    }
}
