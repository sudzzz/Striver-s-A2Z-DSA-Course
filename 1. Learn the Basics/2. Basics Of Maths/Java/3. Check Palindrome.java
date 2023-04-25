/* package codechef; // don't place package name! */

/*
Check Palindrome
*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public int reverseNumber(int n) {
        // Write your code here.
        if(n<10){
            return n;
        }
        int revNum = 0;
        while(n > 0){
            int last_digit = n%10;
            revNum = revNum*10 + last_digit;
            n /= 10;
        }
        return revNum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef obj = new Codechef();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = obj.reverseNumber(n);
		System.out.println(ans + " "+ n);
		if(ans == n){
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not Palindrome");
		}
	}
}
