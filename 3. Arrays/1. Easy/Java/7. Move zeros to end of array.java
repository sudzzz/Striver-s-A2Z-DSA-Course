/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Move zeros to end of array
*/

class Codechef
{
    
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void moveZerosToEndBrute(int arr[],int n){
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i] = temp.get(i);
        }
        for(int i=temp.size();i<n;i++){
            arr[i] = 0;
        }
    }
    
    public static void moveZerosToEndOptimal(int arr[],int n){
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
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
 		
 		moveZerosToEndOptimal(arr,n);
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i]+" ");
 		}
	}
}
