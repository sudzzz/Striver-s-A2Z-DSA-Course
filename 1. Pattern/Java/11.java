/* package codechef; // don't place package name! */

/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void nBinaryTriangle(int n) {
        // Write your code here.
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+j+1)%2+" ");
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
		obj.nBinaryTriangle(n);
	}
}
