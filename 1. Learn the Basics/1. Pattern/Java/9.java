/* package codechef; // don't place package name! */

/*
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *
*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void upperNTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void lowerNTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef obj = new Codechef();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		obj.upperNTriangle(n);
		obj.lowerNTriangle(n);
	}
}
