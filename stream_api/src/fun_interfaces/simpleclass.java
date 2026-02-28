package fun_interfaces;

import java.util.Objects;

public class simpleclass {
    public void m1(String s){
        System.out.println("string argument");
    }
    public void m1(Object o){
        System.out.println("Object arg method");
    }
    public void m1 (int [] arr){
        System.out.println("array arg method");
    }

    public static void main(String[] args) {
        simpleclass a = new simpleclass();
        //a.m1(null);
    }
}
