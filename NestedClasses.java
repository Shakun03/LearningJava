/* package codechef; // don't place package name! */
// NESTED CLASSES

import java.util.*;
import java.lang.*;
import java.io.*;

class Outer
{
    int x = 10;
    class Inner
    {
       int y = 20;
       
       public void hello()
       {
           System.out.println("x is: " + x); //inner class can access outer class data
       }
    }
    static class Inside
    {
        int z = 100;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Outer obj1 = new Outer();
		// you need an Outer class object to create inner one if inner class is non static
		Outer.Inner obj2 = obj1.new Inner(); 
		System.out.println(obj1.x + " " + obj2.y);
		obj2.hello();
		// static inner class does need an outer class object:
		Outer.Inside obj3 = new Outer.Inside();
		System.out.println("z is: " + obj3.z);
		
	}
}

