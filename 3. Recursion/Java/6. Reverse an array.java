/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Reverse an array using Recursion
*/

class Codechef
{
    
   public static void swap(int arr[],int l,int r){
       int k = arr[l];
       arr[l] = arr[r];
       arr[r] = k;
   }
   
   
   public static void reverseArray(int arr[],int l,int r){
       if(l>=r){
           return;
       }
       swap(arr,l,r);
       reverseArray(arr,l+1,r-1);
   }
/*
Instead of using two pointers we can achive the same using one parameter. If l = i, then r = n-i-1 and it will
keep on swapping till i>=n/2
*/
    public static void reverseArrayUsingOneParameter(int arr[],int i){
        int n = arr.length;
        if(i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reverseArrayUsingOneParameter(arr,i+1);
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
		reverseArray(arr,0,n-1);
		for(int i : arr){
		    System.out.print(i+" ");
		}
		System.out.println();
		reverseArrayUsingOneParameter(arr,0);
			for(int i : arr){
		    System.out.print(i+" ");
		}
	}
}
