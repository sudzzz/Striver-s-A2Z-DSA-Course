/* package codechef; // don't place package name! */

/*

A B C D E 
A B C D 
A B C 
A B 
A 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            char letter = 'A';
            for(int j=n-i;j>0;j--){
                System.out.print(letter+" ");
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
