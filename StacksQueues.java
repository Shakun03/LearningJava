/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Stacks
		
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println("Stack is: " + st +" with size: " + st.size());
		
		System.out.println("Top element is: " + st.peek());
		
		System.out.println("Popped out: " + st.pop());
		
		System.out.println("Now stack is: " + st);
		
		while(!st.empty())
		{
		    System.out.println("popping: " + st.pop());
		}
		
	    //Queues:
	    //this can addlast and addfront and removelast and removefront, create queue based on your req.
	    // for FIFO use addLast and removeFirst functions
	    ArrayDeque<Integer> dq = new ArrayDeque<>();
	    dq.addLast(10);
	    dq.addLast(20);
	    dq.addLast(30);
	    System.out.println("Queue contents: " + dq + " with size: " + dq.size()); //10 20 30
	    System.out.println("queue get first element: " + dq.getFirst());
	    System.out.println("removed from first: " + dq.removeFirst());
	    System.out.println("Queue contents: " + dq + " with size: " + dq.size()); // 20 30
	    
	    while(!dq.isEmpty())
	    {
	        System.out.println("Removal from first: " + dq.removeFirst());
	    }
		
		// now addFirst:
		dq.addFirst(10);
		dq.addFirst(20);
		dq.addFirst(30);
		System.out.println("Queue contents: " + dq + " with size: " + dq.size()); // 30 20 10
		
		System.out.println("Queue removing from last: " + dq.removeLast()); // 10
		
	}
}

