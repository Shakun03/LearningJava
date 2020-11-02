/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


//LinkedList container in Java

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList<Integer> list = new LinkedList<Integer> ();
        list.addLast(20);
        list.addFirst(10);
        list.addLast(30);
        System.out.println("List contents: " + list);

        list.removeFirst();
        
        System.out.println("after removing first: " + list);
        
        //int x = list.get(0); --works, not needed her though
        
        System.out.println("element at 0th index: " + list.get(0));
        
        list.set(1,100);
        
        System.out.println("list now is: " + list);
	}
}

