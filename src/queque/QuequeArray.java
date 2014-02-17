package queque;
// ** The complexity of the code has gone past my time allotted to solving it, answer remain working but not fully tested. **
public class QuequeArray {

	String s[];
	int n = 0, head = 0, tail = 0;
	int cap = 1;
	
	class Node{
		Node(String it){item = it;}
		String item;
		Node next;
	}
	
	public QuequeArray(){
		s = new String[1];
	}
	
	public boolean isEmpty(){ return(head == tail);	}
	
	public void enque(String it){
		s[tail++] = it;
		if(tail == cap) resize(cap * 2); 
	}
	
	public String dequeque(){		
		String item = null;
		if(isEmpty() == false){
			item = s[head++];
			int curSize = (tail - head) ; // curSize = (tail - head) + 1; 
			if((cap / 4) == curSize){ // it at 1/4th of its capacity, resize
				resize(curSize);
			}
			else if((cap - tail + head) > ((cap+tail)/2)) // first statement is the number of free memory slots on both side of the queque,
				{resize(cap/4);} // case where the que has triggered the increase resize and the dequeque has move close enough to the tail that there
			// is an excess of empty memory on both sides of the queque equaling greater than  1/4th of the total size memory spent, this case is
			// only achived if the dueque and enqueque are performed in roughly the same amount in alternating order leaving the a gap larger than the above if condition
		}
		else System.out.println("Empty, cant dequeque");
		return item;
	}
	
	public void resize(int amount){
		String[] copy = new String[amount];
		int at = head ;
		for(int i =0; at != tail; ++i){// iterate until at(starting at head) reaches the tail
			copy[i] = s[at++]; // for each will not work here because s has null value and the decrease resize which are still considered strings
		}
		cap = amount;
		s = copy;
		System.out.println("Resized to " +  cap);
		
	}
}


