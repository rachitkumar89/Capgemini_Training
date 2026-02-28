package basic_interface;

public interface A {
    public void m1();
   // public  void m2();
   // public void m3();

    default void m4(){
        System.out.println("m4 from interface a");
    }

}
// using implements
class  B implements  A{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }
}
class C implements A{
    @Override
    public void m1() {
        System.out.println("M1 of C");
    }
}

// overridding without implement key in class declaration
//without using is a relationship this how we can override
class first{
    public static void main(String[] args) {
        A a =new A(){
            @Override
            public void m1() {
                System.out.println("overriding m1 in class first.");
            }
        };
        a.m1();
    }
//@Override
//public void m1(){
//
//
//}
}
