/* package codechef; // don't place package name! */

/*

A 
B B 
C C C 
D D D D 
E E E E E 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void alphaRamp(int n) {
        // Write your code here
        char letter = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(letter+" ");
            }
            System.out.println();
            letter++;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef obj = new Codechef();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		obj.alphaRamp(n);
	}
}
