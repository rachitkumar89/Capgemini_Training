package Synchronized;

class BankAccount{
    int balance=1000;
    public  synchronized void withdraw(int amount) throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" entered withdraw()");
        System.out.println(Thread.currentThread().getName()+"ecquired Lock on BankAccount");

        //check if sufficient balance is available
        if(balance<amount){
            System.out.println("Insufficient balance...");
            System.out.println(Thread.currentThread().getName()+" is going to wait");

            //wait() release the lock and puts
            wait();

            System.out.println(Thread.currentThread().getName()+"got notified and reacquired Lock");
        }
        balance=balance-amount;
        System.out.println(Thread.currentThread().getName()+"complete withdrawal");
        System.out.println("Remaining Balance"+balance);
    }
    public synchronized  void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+"enterd deposit()");
        System.out.println(Thread.currentThread().getName()+"acquired Lock on BankAccount");

        balance =  balance+amount;
        System.out.println(Thread.currentThread().getName()+"deposit amount");
        System.out.println("Update Balance= "+ balance);

        notifyAll();
        System.out.println(Thread.currentThread().getName()+"sent notify signal");
        System.out.println(Thread.currentThread().getName()+"releasing Lock");
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        Thread t1=new Thread(()->{
            try {
                account.withdraw(1500);

            }
            catch (Exception e){}
        },"withdraw -1");

        Thread t2= new Thread(()->{
            account.deposit(1000);
        },"deposit-1");

        t1.start();
        t2.start();
    }
}

