/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1,"Shakun");
		mp.put(2,"Sanchit");
		mp.put(3,"Simer");
		
		for(Integer k : mp.keySet())
		{
		    String val = mp.get(k);
		    System.out.print(val + " ");
		}
	}
}

