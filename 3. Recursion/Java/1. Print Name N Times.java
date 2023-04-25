/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Print name n times using Recursion
*/

class Codechef
{
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("My Name is Sudhir Daga");
        printName(n-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printName(n);
	}
}
