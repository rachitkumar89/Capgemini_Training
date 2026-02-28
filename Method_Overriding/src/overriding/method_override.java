package overriding;

class A{
	public void m1(){
		System.out.println("this is m1");
		}
	public void m2() {
		System.out.println("This is m2");
	}
}
class B extends A{
	public void m1() {
		System.out.println("This is overriding method m1");
	}
	public void m2() {
		System.out.println("This is overriding method m2");
	}
}
public class method_override {
	public static void main(String[] args) {
		B obj=new B();
		obj.m1();
	}
}
