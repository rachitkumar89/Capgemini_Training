package Operators;

public class Ternary_Ques {
	 public static void main(String [] args) {
		 int a =4;
		 int b=3;
		 int c=9;
		 int largest=0;
		 //
		 //largest=(a>b)?a:b;
		 
		 // largest=(((a>b)?a:b)>c)?((a>b)?a:b):c;
		 largest=(a>b) ? ((a>c)?a:c)  : ((b>c)?b:c);
		 System.out.println(largest);
	 }
}
