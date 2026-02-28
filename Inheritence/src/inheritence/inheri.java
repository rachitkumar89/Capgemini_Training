package inheritence;

class A{
	int a=0;
	static int b=5;
	
	void hi() {
		System.out.println("Non - Static Method");
	}
	static void sta() {
		System.out.println("Static Method");
	}
	public A() {
		System.out.println("Parent Constructor");
	}
}
class B extends A{
	
	public B() {
		System.out.println("Child Constructor");
	}
	void hi() {
		System.out.println("Child Non- Static");
		
	}
	static void sta() {
		System.out.println("Static child method");
	}
}
public class inheri{
	public static void main(String []args) {
		B myobj=new B();
		myobj.hi();
		myobj.sta();                                
		System.out.println(myobj.a);
		System.out.println(myobj.b);
	}
}