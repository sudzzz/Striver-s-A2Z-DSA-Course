/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Nth Fibonaaci number using Recursion
*/

class Codechef
{
    
   public static int fib(int n){
       if(n==1 || n==0){
           return n;
       }
       return fib(n-1)+fib(n-2);
   }
    //Time complexity = 2^n
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fib(n);
		System.out.println("Nth Fibonaaci number is "+ans);
	}
}
