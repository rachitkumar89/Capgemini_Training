package Satruday_Question;
import java.util.Scanner;

public class Wallet {

    private int balance;

    public Wallet(int balance) {
        if (balance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void credit(int amount) {
        if (amount <= 0) {
            System.out.println("Credit amount must be positive");
            return;
        }

        balance = balance + amount;
        System.out.println(Thread.currentThread().getName()
                + " credited: " + amount
                + ", Balance: " + balance);
    }

    public synchronized boolean debit(int amount) {
        if (amount <= 0) {
            System.out.println("Debit amount must be positive");
            return false;
        }

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName()
                    + " debited: " + amount
                    + ", Balance: " + balance);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " tried to debit: " + amount
                    + ", Insufficient balance!");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial wallet balance: ");
        int initialBalance = sc.nextInt();

        Wallet wallet = new Wallet(initialBalance);

        Thread t1 = new Thread(() -> wallet.debit(70), "Thread-1");
        Thread t2 = new Thread(() -> wallet.debit(50), "Thread-2");
        Thread t3 = new Thread(() -> wallet.credit(40), "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}