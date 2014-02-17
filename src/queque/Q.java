package queque;

public class Q<Item> {
	Node head = null;
	Node tail = null;
	// o ->->->- o 		fifo
	//push
	//pop
	
	private class Node{
		public Item it;
		Node next = null;
		Node(Item i){
			it = i;
		}
	}
		
		public boolean isEmpty(){
			return (head == null);
		}
		
		public void push(Item pushedItem){
			Node oldTail = tail;
			tail = new Node(pushedItem);
			if(isEmpty()) head = tail;
			else oldTail.next = tail;
		}
		
		public Item pop(){
			if(isEmpty())
				throw new IllegalArgumentException("Mode is illegal");
			Node p = head;
			head = head.next;
			return (Item)p.it;
		}
}