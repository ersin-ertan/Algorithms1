package sorts;

public class Main {
	public static void main(String...strings){
		Comparable[] d = {1,5,58,4,56,55};
		Shell s = new Shell(d);
		Insertion i = new Insertion(d);
		
		Comparable[] n = s.sortData();
		for(Comparable c : n)
			System.out.println(c);		
		
		System.out.println("\n");	
		
		n = i.sortData();
		for(Comparable c : n)
			System.out.println(c);

	}

}
