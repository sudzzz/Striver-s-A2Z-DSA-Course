/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Recursive Insertion Sort
*/

class Codechef
{
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void recursiveInsertionSort(int arr[],int i,int n){
        if(i==n){
            return;
        }
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            swap(arr,j,j-1);
            j--;
        }
        
        recursiveInsertionSort(arr,i+1,n);
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
 		recursiveInsertionSort(arr,1,n);
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i]+" ");
 		}
	}
}
