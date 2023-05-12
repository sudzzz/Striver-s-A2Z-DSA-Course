/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Check if array is sorted or not
*/

class Codechef
{
    
    public static int checkIsSorted(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i-1]<=arr[i]){
                continue;
            }else{
                return 0;
            }
        }
        return 1;
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
 		int isSorted = checkIsSorted(arr,n);
 		if(isSorted==1){
 		    System.out.println("Sorted");
 		}else{
 		    System.out.println("Not Sorted");
 		}
	}
}
