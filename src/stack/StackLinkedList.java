package stack;

public class StackLinkedList {
	private Node head = null;
	
	public StackLinkedList(String[] preSetStrings){
		for(String s : preSetStrings) push(s); // will create stack with strings in it
	}
	
	private class Node{
		String item = null;
		Node next = null;
		public Node(String item){this.item = item;} // create with data in it
		
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public void push(String item){
		Node oldHead = head;
		head = new Node(item);
		head.next = oldHead;
	}
	
	public String pop(){
		String toPush = null;
		try{
			toPush = head.item;
			head = head.next;
			}
		catch(NullPointerException e){System.out.println("pop null pointer");}
		 			
		return toPush;
	}
}
