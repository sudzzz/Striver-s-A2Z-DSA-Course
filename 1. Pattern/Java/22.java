/* package codechef; // don't place package name! */

/*

4444444
4333334
4322234
4321234
4322234
4333334
4444444

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void getNumberPattern(int n) {
        // Write your code here.
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int bottom = (2*n-2)-i;
                int right = (2*n-2)-j;
                System.out.print((n-Math.min(Math.min(top, bottom),Math.min(left, right))));
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
		obj.getNumberPattern(n);
	}
}
