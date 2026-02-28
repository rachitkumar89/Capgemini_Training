package DSA;
import java.util.*;
public class Spiral_Matrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the row length: ");
		int m=sc.nextInt();
		System.out.print("Enter the column length: ");
		int n=sc.nextInt();
		
		int arr[][] = new int[m][n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int top = 0;
		int l = 0;
		int bottom = arr.length - 1;
		int r = arr[0].length - 1;
		while (top <= bottom && l <= r) {
			for (int i = l; i <= r; i++) {
				System.out.print(arr[top][i]+" ");
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][r]+" ");

			}
			r--;

			for (int i = r; i >= l; i--) {
				System.out.print(arr[bottom][i]+" ");
			}
			bottom--;

			for (int i = bottom; i >= top; i--) {
				System.out.print(arr[i][l]+" ");

			}
			l++;

		}
	}
	}


