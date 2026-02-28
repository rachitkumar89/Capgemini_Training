package Encapsulation;

 class Main{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String newname) {
		this.name=newname;
	}
	
}
public class getter_setter{
	public static void main(String []args) {
		Main obj=new Main();
		obj.setName("Rahul");
		System.out.println(obj.getName());
	}
}