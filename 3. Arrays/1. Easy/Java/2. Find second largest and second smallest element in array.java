/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Find second largest and second smallest element in an array
*/

class Codechef
{
    
    public static int findSecondLargest(int arr[],int n){
        int largest = arr[0],secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static int findSecondSmallest(int arr[],int n){
        int smallest = arr[0],secondSmallest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
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
 		int secondLargest = findSecondLargest(arr,n);
 		int secondSmallest = findSecondSmallest(arr,n);
 		System.out.print(secondLargest+" "+secondSmallest);
	}
}
