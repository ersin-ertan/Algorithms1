package stack;

public class Main {
	public static void main(String[] args){
		String[] myStrings = {"kmb","pyfg","aoeu",",.p"};
		
		StackLinkedList stl = new StackLinkedList(myStrings);
		StackArray sa = new StackArray(4);
		StackResizedArray sra = new StackResizedArray();
		
		sra.push(myStrings[0]);
		sra.push(myStrings[2]);
		sra.pop();
		
		String s = stl.pop();
		s = stl.pop();
		System.out.println(s); // second last entry appears
		
		stl.push(myStrings[0]); // pushing kmb
		s = stl.pop();
		System.out.println(s);
		s = stl.pop();
		s = stl.pop();// last item
		s = stl.pop();// null
		s = stl.pop();// null
	
		System.out.println(s);
	
				
		sa.push(myStrings[0]);
		sa.push(myStrings[1]);
		
		s = sa.pop();
		System.out.println(s);

		sa.push(myStrings[0]);
		sa.push(myStrings[1]);
		sa.push(myStrings[1]);
		sa.push(myStrings[2]);// full
		
		
	}

}
