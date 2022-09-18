package question_one;

/*
 * Write three functions that compute the sum of the numbers in a given
list using a
for-loop, a while-loop, and recursion.
 * 
 * */
public class Question1 {

	public static void main(String args[]) {
		
		int arr[]= {1,2,3,4};
		System.out.println(sumForLoop(arr)+"forloop");
		System.out.println(sumWhileLoop(arr)+"while");
		System.out.println(sumRecursion(arr,arr.length)+"recursion");
	}

		//for loop int array
			
	public static int sumForLoop(int arr[] ) {
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {	
			sum = sum+arr[i];
			
		}
		
		
		return sum;
		
		
		
	}
	
	public static int sumWhileLoop(int arr[]) {
		int i=0;
		int sum =0;
		while(i<arr.length) {
			
			sum = sum+arr[i];
			i++;
			
		}
		
		
		return sum;
		
		
	}
	
	
	public static int sumRecursion(int arr[],int n) {
		
		
		if(n<=0) {
			
			return 0;
			
		}
		
		
		  return (sumRecursion(arr, n - 1) + arr[n - 1]);
	}
	
	


}



