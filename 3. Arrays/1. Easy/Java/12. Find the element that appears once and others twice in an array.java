/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Find the element that appears once and others twice in an array
*/

class Codechef
{
    
    public static int findSingleElement(int arr[],int n){
        int xor1 = 0;
        for(int i=0;i<n;i++){
            xor1 = xor1 ^ arr[i];
        }
        return xor1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
 		}
 		int singleElement = findSingleElement(arr,n);
 		System.out.println(singleElement);
	}
}
