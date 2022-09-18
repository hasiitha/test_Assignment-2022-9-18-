package question2;

import java.util.ArrayList;

public class Question {
	/*
	 * Write a function that combines two lists by alternatingly taking
		elements. For
		example: given the two lists [a, b, c] and [1, 2, 3], the function
		should return [a, 1, b, 2,
		c, 3].
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> farra1 = new ArrayList<>();
		farra1.add('a');
		farra1.add('b');
		ArrayList<Character> farra2 = new ArrayList<>();
		farra2.add('1');
		farra2.add('2');
		
		ArrayList<Character> ar = combine(farra1,farra2);
		System.out.println("awa");
		for(char i:ar) {
			
			System.out.println(i);
		}
		
	}
	
	
	public static ArrayList<Character> combine(ArrayList<Character> arr1,ArrayList<Character> arr2){
		
		
		ArrayList<Character> farra = new ArrayList<>();
		
		if(arr1.size() == arr2.size()) {
			boolean getarr1 = true;
			int size = arr1.size()+arr2.size();
			
			int j = 0;
			int k = 0;
			for(int i =0;i<size;i++) {
				
				if(getarr1) {
					
					farra.add(arr1.get(k));
					k++;
					getarr1= false;
				}else {
					farra.add(arr2.get(j));
					j++;
					getarr1= true;
					
				}
			
			}
		}
		
		
		
		//if two list are not same it will return list with no data;
		return farra;
		
		
		
	}

}
