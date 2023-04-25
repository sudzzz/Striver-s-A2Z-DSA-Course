/* package codechef; // don't place package name! */

/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void upperSymmetry(int n){
        int inital_spaces = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inital_spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            inital_spaces += 2;
            System.out.println();
        }

    }
    public void lowerSymmerty(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
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
		obj.upperSymmetry(n);
		obj.lowerSymmerty(n);
	}
}
