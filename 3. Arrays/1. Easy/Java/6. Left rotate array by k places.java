/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Left rotate elements of array by d places
*/

class Codechef
{
    
    public static void leftRotateArray(int arr[],int n,int d){
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
    
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
    
        for(int i=n-d;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
    }
    
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void leftRotateArrayOptimal(int arr[],int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
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
 		int d = sc.nextInt();
 		leftRotateArrayOptimal(arr,n,d%n);
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i]+" ");
 		}
	}
}
