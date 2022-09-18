package extraQuestion;

/*
 * Problem 5 (For extra points)
Write a program that outputs all possibilities to put + or - or nothing
between the
numbers 1, 2, ..., 9 (in this order) such that the result is always
100. For example: 1 + 2
+ 34 – 5 + 67 – 8 + 9 = 100.
 * 
 * */

//didnot finished
public class Extraq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	
	public static int[] Sumto100(int arr[]) {
		
		int extra = 0;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			
			sum = sum+arr[i];
			
			if(arr[i]==100) {
			
			}else {
				
				extra = sum - 100;
				
			}
			
		
		}
		
		
		return null;
		
		
		
	} 

}


