/* package codechef; // don't place package name! */

/*

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void nNumberTriangle(int n) {
        // Write your code here
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
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
		obj.nNumberTriangle(n);
	}
}
