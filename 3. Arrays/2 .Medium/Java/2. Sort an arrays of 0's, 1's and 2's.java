/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Sort an arrays of 0's 1's and 2's
*/

class Codechef
{
    
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void sortArrayOf012Brute(int arr[]){
        Arrays.sort(arr);
    }
    
    public static void sortArrayOf012Better(int arr[]){
        int n = arr.length;
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                cnt0++;
            }else if(arr[i]==1){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        //System.out.print(cnt0 + " " + cnt1 + " " + cnt2);
        for(int i=0;i<cnt0;i++){
            arr[i] = 0;
        }
        for(int i=0;i<cnt1;i++){
            arr[i+cnt0] = 1;
        }
        for(int i=0;i<cnt2;i++){
            arr[i+cnt0+cnt1] = 2;
        }
    }
    
    //Dutch National Flag Algorithm
    public static void sortArrayOf012Optimal(int arr[]){
        int n = arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
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
 		sortArrayOf012Optimal(arr);
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i] + " ");
 		}
	}
}
