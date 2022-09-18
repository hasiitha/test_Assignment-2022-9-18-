package question3;

import java.util.ArrayList;


/*
 * Write a function that computes the list of the first 100 Fibonacci
numbers. By
definition, the first two numbers in the Fibonacci sequence are 0 and
1, and each
subsequent number is the sum of the previous two. As an example, here
are the first
10 Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 * 
 * 
 * */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonaci100());
		}
	
	
	public static int fibonaci100(){
		int  num1 = 0;
		int num2 = 0;
		int prevsum = 1;
		int sum =0;
     
        for(int i = 1; i <= 3; i++)
        {
            num1 = num2;
            num2 = prevsum;
            prevsum = num1 + num2;
     
            sum = sum +num1;
        }
		return sum;
	}
	}
