package question4;

import java.util.Arrays;
/*
 * Write a function that given a list of non negative integers, arranges
them such that
they form the largest possible number. For example, given [50, 2, 1,
9], the largest
formed number is 95021.
 * 
 * 
 * */
		
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {50,2,1,9};
		System.out.println(arrangeNumber(arr));
		
	}
	
	
	public static int arrangeNumber(int arr[]) {
		String s =" ";
		for(int i=0;i<arr.length;i++) {
			
			s = s+ arr[i];
			
			
		}
		
		s = s.trim();
		int arr1[] = new int[s.length()]; 
		
		for(int i=0;i<s.length();i++) {
			String digit = Character.toString(s.charAt(i));
					
			arr1[i] = Integer.parseInt(digit);
			
		}
		
		Arrays.sort(arr1);
		String s1 = "";
		
		for(int i= arr1.length-1;i>=0;i--) {
			
			s1 = s1+arr1[i];
			
		}
		
		s1 = s1.trim();
		int finalnumb = Integer.parseInt(s1);
		return finalnumb;
		
	}

}
