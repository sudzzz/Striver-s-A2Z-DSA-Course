/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Longest Subarray With Sum K (Poitivies and Negatives)
*/

class Codechef
{
    
    public static int longestSubArrayWithSumKContainingPositivesAndNegativesBrute(int arr[],int k){
        int maxLen = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + arr[j];
                if(sum == k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    
    public static int longestSubArrayWithSumKWithArrayContainingPositivesAndNegativesOptimal(int arr[],int k){
        int maxLen = 0;
        int n = arr.length;
        Map<Integer,Integer> preSumMap = new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
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
 		int maxLen = longestSubArrayWithSumKWithArrayContainingPositivesAndNegativesOptimal(arr,k);
 		System.out.println(maxLen);
	}
}
