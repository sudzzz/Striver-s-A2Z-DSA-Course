/* package codechef; // don't place package name! */

/*
12345
1234
123
12
1

*/
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		for(int i=1;i<=5;i++)
		{
		    for(int j=1;j<=5-i+1;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
