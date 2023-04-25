/* package codechef; // don't place package name! */

/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void symmetry(int n) {
        // Write your code here
        int spaces = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<n){
                spaces -= 2;
            }
            else{
                spaces +=2;
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
		obj.symmetry(n);
	}
}
