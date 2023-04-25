/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Check if a string is palindrome using Recursion
*/

class Codechef
{
    
   public static boolean checkPalindrome(String s,int i){
       if(i>=s.length()/2){
           return true;
       }
       if(s.charAt(i)!=s.charAt(s.length()-i-1)){
           return false;
       }
       return checkPalindrome(s,i+1);
   }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = checkPalindrome(s,0);
		if(ans){
		    System.out.println("Palindrome");
		}else{
		    System.out.println("Not Palindrome");
		}
	}
}
