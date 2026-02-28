package Thread;

public class ThreadDemo  extends Thread{
    public void run(){

        try {
            for (int i = 0; i < 11; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo t=new ThreadDemo();

        t.start();
        t.setName("another thread");
        try{
            t.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main");
    }
}

