package DSA;
import java.util.Stack;
public class EXP_Evaluatiom {
	public static void calculation(String s) {
		Stack<Integer> sta=new Stack<Integer>();
		int n=s.length()-1;
		if(s.length()<2||s.charAt(0)=='/' || s.charAt(0)=='*' || s.charAt(0)=='+' ||  s.charAt(0)=='+' || s.charAt(0)=='%' ||  s.charAt(0)=='-' ||
				s.charAt(n)=='/' || s.charAt(n)=='*' || s.charAt(n)=='-' || s.charAt(n)=='+' || s.charAt(n)=='%') {
			System.out.println("Invalid String");
		}
		int digit=1;
		for(char c:s.toCharArray()) {
		if(Character.isDigit(c)) {
			digit*=((int)c);
			sta.push(digit);
			digit*=10;
				
		}
		if(c == '+'  || c == '/'|| c == '*' || c == '-') {
			char store=c;
			
		}
		
		
		}
	}
public static void main(String[] args) {
	String s1="2+3";
	String s2="56*4/5";
	String s3="235%";
	calculation(s3);
}
}
