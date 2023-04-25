/* package codechef; // don't place package name! */

/*
Count number of digits in a number
*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public int countDigits(int n) {
        // Write your code here.
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef obj = new Codechef();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = obj.countDigits(n);
		System.out.println(ans);
	}
}
