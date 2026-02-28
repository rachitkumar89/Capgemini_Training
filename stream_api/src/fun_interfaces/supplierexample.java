package fun_interfaces;

import java.util.function.Supplier;

public class supplierexample {
    public static void main(String[] args) {
        Supplier<String> s= new Supplier<String>() {
            @Override
            public String get() {
                return "Supplier inner class";
            }
        };
        System.out.println(s.get());

        //Supplier s1= ()->"Supplier Lambda";
        //System.out.println(s1.get());
    }
}
