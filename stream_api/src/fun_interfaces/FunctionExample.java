package fun_interfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> fun=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };
        System.out.println(fun.apply(12));

//Function <Integer,Integer> fun1=number->number*number;
//        System.out.println(fun1.apply(10));


    }
}
