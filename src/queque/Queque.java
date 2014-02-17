package queque;

public class Queque {
	private Node head, tail;
	
	private class Node{
		Node(String it){item = it;}
		String item;
		public Node next;
	}
	
	public void enque(String it){
		Node oldTail = tail;
		tail = new Node(it);
		tail.next = null;
		if(isEmpty() == true) head = tail;
		else oldTail.next = tail;
		
	}
	
	public String dequeque(){
		String item = null;
		try{
			item = head.item;
			head = head.next;
			if(isEmpty() == true) tail = null;
			System.out.println(item);
			}catch (NullPointerException e) {System.out.println("no more in queque");}
		return item;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	
	

}
