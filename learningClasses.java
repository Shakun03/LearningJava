/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//STRINGS AND STRINGBUILDERS

/* Name of the class has to be "Main" only if the class is public. */

class Hello 
{
    int x=5;
    final int y =10;
    
    public Hello()
    {
        System.out.println("constr called");
    }
    
    public Hello(String s)
    {
       System.out.println("Hello " + s);   
    }
    
    static void helloWorld()
    {
        System.out.println("helloWorld called!");
    }
    
    public void callingHello()
    {
        helloWorld();
    }
}

class Codechef
{
    static void CodeChefFun()
    {
        System.out.println("hi static");
    }
    public void codechefpub()
    {
        System.out.println("hi public");
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Hello obj = new Hello("Shakun"); 
	    System.out.println("obj.x is: " + obj.x);
	    obj.x = 100; //you can modify x but cannot modify y because it is 'final'.
	    // So, overriding not allowed if final is used on data members.
	    obj.callingHello();
	    
	    CodeChefFun();
	    
	    //codechefpub(); will fail because you cannot call non static method inside a static funct 
	    // unless you use an object to call it.
	    
	    Codechef cf = new Codechef();
	    cf.codechefpub();
	   
	}	
}


