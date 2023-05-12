/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Left rotate elements of array by 1 place
*/

class Codechef
{
    
    public static void left_rotate_by_one(int arr[],int n){
    // code here
        int firstElement = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstElement;
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
 		left_rotate_by_one(arr,n);
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i]+" ");
 		}
	}
}
