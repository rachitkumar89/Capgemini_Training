package DSA;
import java.util.*;
public class Browser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> sta=new Stack<>();
		sta.push(-1);
		Stack<String> sta1=new Stack<>();
		sta1.push("Home");
		while(!sta.isEmpty()) {
			System.out.println("Current Page: "+sta1.peek());
			System.out.println("Enter the 0 for backward and 1 for forward: ");
			
			int n=sc.nextInt();
			
			if(n==1) {
				sta.push(1);
				System.out.println("Enter the next page: ");
				String st=sc.next();
				sta1.push(st);
			}
			if(n==0) {
				if(sta.pop()==-1) {
					System.out.println("No page.");
				}
				else {
					sta.pop();
					sta.pop();
				}
			}
		}
		
	}
}
