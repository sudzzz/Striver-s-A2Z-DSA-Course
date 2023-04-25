/* package codechef; // don't place package name! */

/*

A 
A B 
A B C 
A B C D 
A B C D E 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void nLetterTriangle(int n) {
        // Write your code here
        
        for(int i=0;i<n;i++){
            int letter = 65;
            for(int j=0;j<=i;j++){
                System.out.print((char)letter+" ");
                letter++;
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
		obj.nLetterTriangle(n);
	}
}
