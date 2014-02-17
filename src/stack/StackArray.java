package stack;

public class StackArray {
	private String[] s;
	private int n = 0;
	private int cap = 0;
	private boolean isEmpty = true;
	private boolean isFull= false;
	
	public StackArray(int cap){ s = new String[cap]; this.cap = cap;}
	
	public boolean isEmpty(){ return isEmpty;}
	public boolean isFull(){ return isFull;}
	
	public void push(String item){

		if(!isFull){
			 isEmpty = false;
			s[n++] = item;
			if(n == cap) isFull = true;
		}
		else System.out.println("StackArray is full");
	}
	
	public String pop(){ // protected pops
		if(!isEmpty){
			isFull = false;
			String toSend = s[--n];
			s[n] = null; // set it to null for garbage collector
			if(n == 0) isEmpty = true;
			return toSend;
		}
		 System.out.println("StackArray is empty");
		return null;
	}

}
