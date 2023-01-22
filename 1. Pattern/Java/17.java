/* package codechef; // don't place package name! */

/*

     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void alphaHill(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char letter = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(letter);
                if(j<breakpoint)
                    letter++;
                else
                    letter--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
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
		obj.alphaHill(n);
	}
}
