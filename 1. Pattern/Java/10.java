/* package codechef; // don't place package name! */

/*

*
**
***
****
*****
****
***
**
*

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<2*n-1;i++){
            if(i<n){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=i;j<2*n-1;j++){
                    System.out.print("*");
                }
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
		obj.nStarTriangle(n);
	}
}
