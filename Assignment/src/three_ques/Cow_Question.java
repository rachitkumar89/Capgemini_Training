package three_ques;
import java.util.*;
public class Cow_Question {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the circle length: ");
		double s=sc.nextInt();
		System.out.print("Enter the length of rope for cow:");
		double l=sc.nextInt();
		if(l<s/2){
			System.out.print(false);
		}
	}
}
