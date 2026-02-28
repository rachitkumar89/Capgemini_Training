package DSA;
//2. find largest and smallest

public class Largest_Smallestst {
	 public static void largest(int [] arr) {
		 int largest=arr[0];
		 int smallest=arr[0];
		 for(int i=1;i<arr.length;i++ ) {
			 if(arr[i]>largest) {
				 largest=arr[i];
			 }
			 if(arr[i]<smallest) {
				 smallest=arr[i];
			 }
			 
		 }
		 System.out.println(largest);
		 System.out.println(smallest);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stubrd8
		int [] arr= {0,2,1,0,4,2,5,8};
		largest(arr);
		}
}
