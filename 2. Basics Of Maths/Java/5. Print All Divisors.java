/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*
Print all divisors of a given number
*/

class Codechef
{
    public static void printDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for(int l : list){
            System.out.print(l+" ");
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDivisors(n);
	}
}
