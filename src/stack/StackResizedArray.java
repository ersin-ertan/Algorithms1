package stack;

public class StackResizedArray {
	private String[] s;
	private int n = 0;
	private boolean isEmpty = true;
	
	public StackResizedArray(){ s = new String[1];}
	
	public boolean isEmpty(){ return isEmpty;}
	
	public void push(String item){
		isEmpty = false;
		s[n++] = item;
		if(n == s.length){ resize(s.length * 2);}
	}
	
	public String pop(){ // protected pops
		if(!isEmpty){
			String toSend = s[--n];
			s[n] = null; // set it to null for garbage collector
			if(n > 0 && n == (s.length / 4) ) resize(s.length / 2);
			if(n == 0) isEmpty = true;
			return toSend;
		}
		 System.out.println("StackArray is empty");
		return null;
	}
	
	private void resize(int amount){
		String[] copy = new String[amount];
		int at = 0 ;
		for(int i =0; i < n; ++i){
			copy[at] = s[at++]; // for each will not work here because s has null value and the decrease resize which are still considered strings
		}
		s = copy;
		System.out.println("Resized to " +  s.length);
	}

}
