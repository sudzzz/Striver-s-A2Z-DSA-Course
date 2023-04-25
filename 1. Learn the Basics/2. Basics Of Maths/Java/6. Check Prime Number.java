/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Check if a given number is prime or not
*/

class Codechef
{
    public static void checkPrime(int n){
        int count = 0;
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("Number "+n+" is prime");
        }else{
            System.out.println("Number "+n+" is not prime");
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkPrime(n);
	}
}
