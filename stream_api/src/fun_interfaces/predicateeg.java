package fun_interfaces;

import java.util.function.Predicate;

public class predicateeg {
    public static void main(String[] args) {
        Predicate<Integer> predicate= new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >=11;
            }
        };
        System.out.println(predicate.test(10));

        // using lambda funtion
        Predicate<Integer> predicate1 =number -> number>0;
        System.out.println(predicate1.test(10));
    }
}
