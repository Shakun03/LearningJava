/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


abstract class AnimalClass
{
    public abstract void fun();
    public void fun2()
    {
        System.out.println("fun2 called");
    }
}

interface AnimalInterface
{
    public void fun3();
   // public void fun4();
}

class Tiger extends AnimalClass implements AnimalInterface //multiple interface implements also possible separated by comma
{
    public void fun()
    {
        System.out.println("abstract class fun");
    }
    void funn()
    {
        System.out.println("tiger fun");
    }
    public void fun3()
    {
        System.out.println("interface class fun");
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Tiger obj = new Tiger();
		obj.funn();
	}
}

