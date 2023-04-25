/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Check if a number is Armstrong or not.
371 = 3^3 + 7^3 + 1^3
1634 = 1^4 + 6^4 + 3^4 + 4^4
*/

class Codechef
{
    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		double s = 0.0;
		int count = countDigits(n);
		while(n>0){
		    int r = n%10;
		    s = s + Math.pow(r,count);
		    n = n/10;
		}
		if(m==s){
		    System.out.println("n = "+ m + " is an Armstrong number");
		}
		else{
		    System.out.println("n = "+m +" is not an Armstrong number");
		}
	}
}
