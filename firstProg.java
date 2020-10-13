/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//defining variables in java
		int a =2;
		String s = "Hello";
		System.out.println(s + " " + a); //println takes care of endl here.
		//defining arrays:
		int[]arr = new int[5];
		arr[0]=50;
		arr[3]=100;
		//looping over array:
		
		for(int val : arr)
		{
		    System.out.print(val+ " "); //print is without endl
		}
		System.out.println(); // for end of line
		//print array length using arr.length:
		System.out.println("size of array is: " + arr.length);
		
		// Array List is like vector in C++
		ArrayList<Integer> list = new ArrayList<>();
		// add elements to ArrayList:
		list.add(1);
		list.add(5);
		list.add(10);
		//simply printing list will give you: [1,5,10] as output and size is: list.size();
		System.out.println("List is: " + list + "\nlist size is: " + list.size());
		//update an ith index of arraylist:
		list.set(1,100); //update 1 index with value 100
		System.out.println("Updated List is: " + list);
		/*if say you want to add 200 at 1th index element and want existing elements to accordingly shift such that 
		 now from [1,100,10] you have [1,200,100,10] you use add: */
		list.add(1,200);
		System.out.println("Updated List is: " + list);
		//to fetch an ith index element you can't use list[i]:
		int val = list.get(1);
		System.out.println("value at 1th index is: " + val);
		//removing an element via index from arraylist:
		list.remove(1);
		System.out.println("Updated List is: " + list);
		//You can have similarly a string arraylist too:
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Hello");
		list2.add("World");
		System.out.println("String list is: " + list2);
        //you can loop over arraylist too similar to array:
        for(String vall : list2)
        System.out.println(vall);
        // oh and instead of C++ you can use this in java:
        for(Object vall : list2)
        {
            System.out.println(vall);
        }
	}
}

