/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Summation of first N numbers using Recursion
*/

class Codechef
{
    public static int findSumUsingParameterisedFunction(int n,int s){
        if(n==0){
            return s;
        }
        s += n;
        return findSumUsingParameterisedFunction(n-1,s);
    }
    
    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        return n+findSum(n-1);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = findSumUsingParameterisedFunction(n,0);
		int sum2 = findSum(n);
		System.out.println("Sum of first N numbers is "+sum1);
		System.out.println("Sum of first N numbers is "+sum2);
	}
}
