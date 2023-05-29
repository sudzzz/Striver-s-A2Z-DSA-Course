/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Two Sum Problem in an array
*/

class Codechef
{
    
    public static String twoSumProblemBrute(int arr[],int target){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return "Yes";
                }
            }
        }
        return "No";
    }
    
    public static String twoSumProblemBetterWithHashing(int arr[],int target){
        int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            int rem = target - arr[i];
            if(mpp.containsKey(rem)){
                return "Yes";
            }
            mpp.put(arr[i],i);
        }
        return "No";
    }
    
    public static String twoSumProblemOptimalWithTwoPointerApproach(int arr[],int target){
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0,right = n-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return "Yes";
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return "No";
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
 		int k = sc.nextInt();
 		String result = twoSumProblemOptimalWithTwoPointerApproach(arr,k);
 		System.out.println(result);
	}
}
