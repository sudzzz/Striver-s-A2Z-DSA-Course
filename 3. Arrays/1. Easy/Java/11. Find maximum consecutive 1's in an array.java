/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Find maximum consecutive One's in an array
*/

class Codechef
{
    
    public static int findMaximumConsecutiveOnes(int arr[],int n){
        int maximum = 0,counter = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                counter++;
                maximum = Math.max(maximum,counter);
            }else {
                counter = 0;
            }
        }
        return maximum;
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
 		int maximumConsecutiveOnes = findMaximumConsecutiveOnes(arr,n);
 		System.out.println(maximumConsecutiveOnes);
	}
}
