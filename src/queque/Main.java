package queque;

import java.util.Scanner;

public class Main <Item>{
	public static void main(String[] args){
		Q q = new Q();
		 Object i = q.pop();
		 
		// q.push((Item)i);
	/*	Queque q = new Queque();
		q.enque("hi");
		q.enque("greetings");
		q.enque("salutations");
		q.dequeque();
		q.dequeque();
		q.dequeque();
		
		q.dequeque(); // gives error	
		
		QuequeArray qa = new QuequeArray();
		qa.enque("hello");
		qa.enque("hello1");
		qa.enque("hello2");
		
		System.out.println(qa.dequeque());
		System.out.println(qa.dequeque());
		System.out.println(qa.dequeque());
		System.out.println(qa.dequeque());// will return an null
*/

		
		// fundamental problems with the queque array is the traveling queque within its constructed array which
		// leaves a trail of unaccessible memory, this is solved in my implementation using the 1/4 guide for most efficiency
		// shown by an resizing array implementation trace of dequeque and enqueque operations
				
	}
}
