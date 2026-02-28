package Thread;

import java.security.spec.ECField;

class Runnabledemo implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Hello from Runnable");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Mythread1 {


    public static void main(String[] args) {
        Runnabledemo t= new Runnabledemo();
        Thread t1= new Thread(t);
        t1.start();
        try {
            t1.join();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
