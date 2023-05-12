/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Remove duplicate elements from sorted array.
*/

class Codechef
{
    
    public static int remove_duplicate(int arr[],int n){
        // code here
        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
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
 		int size = remove_duplicate(arr,n);
 		for(int i=0;i<size;i++){
 		    System.out.print(arr[i]+" ");
 		}
	}
}
