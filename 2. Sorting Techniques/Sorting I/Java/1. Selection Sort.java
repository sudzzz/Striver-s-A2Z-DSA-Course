/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Selection Sort
*/

class Codechef
{
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minimum = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minimum]){
                    minimum = j;
                }
            }
            swap(arr,i,minimum);
        }
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
 		selectionSort(arr);
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i]+" ");
 		}
	}
}
