/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Factorial of first N numbers using Recursion
*/

class Codechef
{
   public static int findFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*findFactorial(n-1);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = findFactorial(n);
		System.out.println("Factorial of first N numbers is "+factorial);
	}
}
