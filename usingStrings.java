/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Strings:
		
		String s1 = "Hello";
		System.out.println("String is: " + s1);
		//fetch a character at 1st Index
		char ch = s1.charAt(1);
		System.out.println("char at 1st index is: " + ch);
		System.out.println("length of string is: " + s1.length());
		
		//substring in java is like [i,j) that is j not included  hello
		System.out.println("'He' printed like: " + s1.substring(0,2));
		System.out.println("'llo' printed like: " + s1.substring(2,5));
		//print all substrings of a given string:
		System.out.println("all substrings: ");
		for(int i=0; i<s1.length(); i++)
		{
		    for(int j=i+1; j<=s1.length(); j++)
		    {
		        System.out.println(s1.substring(i,j));		        
		    }
		}
		
		
		
	}
}

