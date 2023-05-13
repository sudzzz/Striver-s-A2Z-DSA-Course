/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Find union of two sorted arrays
*/

class Codechef
{
    
    public static List<Integer> unionOfSortedArraysBruteForce(int arr1[],int arr2[]){
        Set<Integer> st = new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            st.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            st.add(arr2[i]);
        }
        List<Integer> ans = new ArrayList<Integer>(st);
        // for(Integer it : st){
        //     ans.add(it);
        // }
        return ans;
    }
    public static List<Integer> unionOfSortedArraysOptimal(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0,j=0;
        List<Integer> ans = new ArrayList<Integer>();
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else{
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }
        while(j<n2){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
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
        List<Integer> ans = unionOfSortedArraysOptimal(arr1,arr2);
 		for(Integer i : ans){
 		    System.out.print(i+" ");
 		}
	}
}
