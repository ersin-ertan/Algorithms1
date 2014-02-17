package stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackWithIterator<String> implements Iterable<String> {
	private Node head;
	
	private class Node{
		String item;
		Node next;
		Node(String item){this.item = item;	}
	}
	
	public boolean isEmpty(){ return (head == null);}
	
	public void push(String item){
		Node oldHead = head;
		head = new Node(item);
		head.next = oldHead;
		// adjust the pointer of the oldHead
	}
	
	public String pop(){
		String item = null;
		if(isEmpty()) throw new NoSuchElementException("stack underflow");
		item = head.item;
		head = head.next;
		return item;
	}

	public class ListIterator implements Iterator<String>{
		private Node current = head;
		
		@Override
		public boolean hasNext() {return current != null;	}

		@Override
		public String next() {	

			String item = null;
			if(isEmpty()) throw new NoSuchElementException("stack underflow");
			item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {		
		}
		
	}
	
	@Override
	public Iterator<String> iterator() {return new ListIterator();	}

}
