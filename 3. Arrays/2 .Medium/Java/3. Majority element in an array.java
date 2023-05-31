/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Majority element in an array
*/

class Codechef
{
    
    public static int majorityElementInArrayBrute(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    cnt++;
                }
            }
            if(cnt > (n/2)){
                return arr[i];
            }
        }
        return -1;
    }
    
    public static int majorityElementInArrayBetter(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mpp.containsKey(arr[i])){
                mpp.put(arr[i],mpp.get(arr[i])+1);
            }else{
                mpp.put(arr[i],1);
            }
        }
        for(int key : mpp.keySet()){
            if(mpp.get(key) > (n/2)){
                return key;
            }
        }
        return -1;
    }
    
    //Moore's Voting Algorithm
    public static int majorityElementInArrayOptimal(int arr[]){
        int n = arr.length;
        int cnt=0,el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt = 1;
                el = arr[i];
            } else if(arr[i] == el){
                cnt++;
            } else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==el){
                cnt1++;
            }
        }
        if(cnt1 > (n/2)){
            return el;
        }
        return -1;
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
 		int result = majorityElementInArrayOptimal(arr);
 	    System.out.println(result);
	}
}
