/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Recursive Bubble Sort
*/

class Codechef
{
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void recursiveBubbleSort(int arr[],int n){
        if(n==1){
            return;
        }
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
        }
        recursiveBubbleSort(arr,n-1);
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
 		recursiveBubbleSort(arr,n);
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i]+" ");
 		}
	}
}
