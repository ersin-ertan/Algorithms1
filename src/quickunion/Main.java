package quickunion;

import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
		
		 Scanner sc = null;
		 
		 try{
			 sc = new Scanner(new BufferedReader(new FileReader("quickfind.txt")));

			 int N = sc.nextInt();
			 QU qf = new QU(N);
			
			while(sc.hasNext()){
				int p= sc.nextInt();
				int q = sc.nextInt();
				
				if(!qf.connected(p, q)){
					qf.union(p, q);
			}		
		}
		qf.print();
		 } finally{	sc.close();}

		
	}

}
