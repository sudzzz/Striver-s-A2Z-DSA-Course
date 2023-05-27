/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Find missing number in an array
*/

class Codechef
{
    
    public static int findMissingNumberBruteFore(int arr[],int n){
        for(int i=1;i<=n;i++){
            int flag = 0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
    
    public static int findMissingNumberBetter(int arr[],int n){
        int hash[] = new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]] = 1;
        }
        for(int i=1;i<n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    
    public static int findMissingNumberOptimalUsingSum(int arr[],int n){
        int sum = (n*(n+1))/2;
        int arr_sum = 0;
        for(int i=0;i<n-1;i++){
            arr_sum += arr[i];
        }
        return sum - arr_sum;
    }
    
    public static int findMissingNumberOptimalUsingXorWithTwoArrayTraversal(int arr[],int n){
        int xor1=0,xor2=0;
        for(int i=1;i<=n;i++){
            xor1 = xor1 ^ i;
        }
        for(int i=0;i<n-1;i++){
            xor2 = xor2 ^ arr[i];
        }
        return xor1 ^ xor2;
    }
    
    public static int findMissingNumberOptimalUsingXorWithOneArrayTraversal(int arr[],int n){
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ arr[i];
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n-1];
		for(int i=0;i<n-1;i++){
		    arr[i] = sc.nextInt();
 		}
 		int missingNumber = findMissingNumberOptimalUsingXorWithOneArrayTraversal(arr,n);
 		System.out.println(missingNumber);
	}
}
