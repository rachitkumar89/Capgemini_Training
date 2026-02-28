package DSA;
import java.util.*;
public class Paranthesis {
	public static boolean valid(String s) {
		Stack<Character> st = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				st.push(')');
			}
			else if(c == '{') {
				st.push('}');
			}
			else if(c == '[') {
				st.push(']');
			}
			else if(st.isEmpty() || st.pop()!=c) {
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="}{";
		String s2="[}]{";
		String s3="[({[}})}";
		String s4="{}()[]";
		System.out.println(valid(s1));
		System.out.println(valid(s2));
		System.out.println(valid(s3));
		System.out.println(valid(s4));
		
	}

}
