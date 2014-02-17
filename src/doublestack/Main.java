package doublestack;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner st = new Scanner( new File("input.txt"));
		DoubleStack ds = new DoubleStack();
		
		while(st.hasNext()){
			ds.readItem(st.next());
		}
		ds.printAns();
			
		
	}
}
