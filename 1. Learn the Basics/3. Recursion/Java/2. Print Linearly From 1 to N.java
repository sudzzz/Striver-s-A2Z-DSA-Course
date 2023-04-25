/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Print linearly from 1 to n using Recursion
*/

class Codechef
{
    public static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNum(n);
	}
}
