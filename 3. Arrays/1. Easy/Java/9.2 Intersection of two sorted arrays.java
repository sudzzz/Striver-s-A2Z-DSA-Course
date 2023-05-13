/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Find intersection of two sorted arrays
*/

class Codechef
{
    
    public static List<Integer> intersectionOfSortedArraysBruteForce(int arr1[],int arr2[]){
       List<Integer> ans = new ArrayList<Integer>();
       int n1 = arr1.length;
       int n2 = arr2.length;
       int visited[] = new int[n2];
       for(int i=0;i<n2;i++){
           visited[i]=0;
       }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j] && visited[j]==0){
                    ans.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
        return ans;
    }
    public static List<Integer> intersectionOfSortedArraysOptimal(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0,j=0;
        List<Integer> ans = new ArrayList<Integer>();
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }else{
                j++;
            }
        }
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		for(int i=0;i<n1;i++){
		    arr1[i] = sc.nextInt();
 		}
 		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		for(int i=0;i<n2;i++){
		    arr2[i] = sc.nextInt();
 		}
        List<Integer> ans = intersectionOfSortedArraysOptimal(arr1,arr2);
 		for(Integer i : ans){
 		    System.out.print(i+" ");
 		}
	}
}
