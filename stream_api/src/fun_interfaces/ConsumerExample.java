package fun_interfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Consumer InnerClass");
        // Consumer<Interger> consumer1=number1->{
//        System.out.println(number);
//    };
        //consumer1.accept(20);
    }
}
