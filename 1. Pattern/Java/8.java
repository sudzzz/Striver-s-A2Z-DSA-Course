/* package codechef; // don't place package name! */

/*
*********
 ******* 
  *****  
   ***   
    *

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
		for(int i=0;i<5;i++)
		{
		    //Space
		    for(int j=0;j<i;j++)
		    {
		        System.out.print(" ");
		    }
		     //Star -> 2n - (2i+1)
		    for(int j=0;j<10-(2*i+1);j++)
		    {
		        System.out.print("*");
		    }
		     //Space
		    for(int j=0;j<i;j++)
		    {
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
