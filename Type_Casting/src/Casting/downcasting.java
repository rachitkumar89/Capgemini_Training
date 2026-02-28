package Casting;

class C{
	public void m1(){
		System.out.println("this is m1");
		}
	public void m2() {
		System.out.println("This is m2");
	}
}
class D extends C{
	public void m1() {
		System.out.println("This is overriding method m1");
	}
	
}
public class downcasting{
	public static void main(String[] args) {
		C myobj=new D();
		if(myobj instanceof D) {
			D myobj2 =(D) myobj;
			myobj.m1();
		}
	}
}
