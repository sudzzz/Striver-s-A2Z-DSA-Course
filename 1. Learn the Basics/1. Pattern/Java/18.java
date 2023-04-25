/* package codechef; // don't place package name! */

/*

E 
D E 
C D E 
B C D E 
A B C D E 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void alphaTriangle(int n) {
        // Write your code here
        int letter = 65+n-1;
        for(int i=0;i<n;i++){
            char ch = (char)letter;
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            letter--;
            System.out.println();
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef obj = new Codechef();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		obj.alphaTriangle(n);
	}
}
