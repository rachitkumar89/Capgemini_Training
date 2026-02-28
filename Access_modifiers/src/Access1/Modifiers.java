package Access1;


public class Modifiers {

	public void A() {
		int x=5;
		int y=9;
		int sum=x+y;
		System.out.println("Public Method A() into the access class:"+sum);
	}
	protected void B() {
		int x1=4;
		int y1=8;
		int sum1=x1+y1;
		System.out.println("Protected method B() into the access class: " + sum1);
	}
	private void C() {
		int x2=1;
		int y2=3;
		int sum2=x2+y2;
		System.out.println("Private Method C() into the acess class: "+sum2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifiers obj=new Modifiers();
		obj.A();
		obj.B();
		obj.C();

	}

}
