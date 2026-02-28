package games_questions;
import java.util.*;

public class Game_0_X {
	
	public static void printer(String [][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean finished(String[][] matrix) {
		if ( matrix!=null && matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2]
				|| matrix!=null && matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2]
				||matrix!=null && matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2]
				||matrix!=null && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]
				||matrix!=null && matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]
				||matrix!=null && matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0]
				||matrix!=null && matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1]
				||matrix!=null && matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2]) {
			return true;
		}
		return false;
	}
	public static void main(String [] args) {
		String matrix[][]=new String [3][3];
	//User Input
		Scanner sc=new Scanner(System.in);
		int count=9;
		String p1="X";
		String p2="O";
		
		boolean win=finished(matrix);
		while(count!=0) {
			int row=sc.nextInt();
			int col=sc.nextInt();
			if(matrix[row][col]!=null) {
				System.out.println("Please Enter Valid Choice.");
			}else {
				matrix[row][col]=p1;
				
			}
			int row1=sc.nextInt();
			int col1=sc.nextInt();
			if(matrix[row1][col1]!=null) {
				System.out.println("Please Enter Valid Choice.");
			}
			else {
				matrix[row1][col1]=p2;
				
			}
			count--;
			printer(matrix);
			if(win) {
				System.out.println("You Win.");
			}
		}
	}
}
