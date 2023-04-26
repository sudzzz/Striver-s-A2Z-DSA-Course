/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Counting frequencies of array elements using hashing
*/

class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    if(mp.containsKey(arr[i])){
		        mp.put(arr[i],mp.get(arr[i])+1);
		    } else {
		        mp.put(arr[i],1);
		    }
		}
	
		for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
		    System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
		int q = sc.nextInt();
		while(q>0){
		    int number = sc.nextInt();
		    if(mp.containsKey(number)){
		        System.out.println(mp.get(number));
		    }else{
		        System.out.println(0);
		    }
		    q--;
		}
	}
}
