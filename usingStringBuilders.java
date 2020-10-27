/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//STRINGS AND STRINGBUILDERS

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String str = "";
	    int n = 1000;
	    long start = System.currentTimeMillis();
	    for(int i=0; i <n ;i++)
	    {
	        str += i;
	    }
	    long end = System.currentTimeMillis();
	    
	    System.out.println("string took: " + (end - start)+ " val: " + str);
	    System.out.println("str capcaity: " + str.length());
	    
	    StringBuilder sb = new StringBuilder("");
	    
	    start = System.currentTimeMillis();
	    for(int j=0 ; j<n ;j++)
	    {
	        sb.append(j);
	    }
	    end = System.currentTimeMillis();
	    System.out.println("stringbuilder took: " + (end - start) + " val: " + sb);
	    System.out.println("sbeetan");
	    
	}	
}


