package quickfind;

import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		
		 Scanner sc = null;
		 
		 try{
			 sc = new Scanner(new BufferedReader(new FileReader("quickfind.txt")));

		int N = sc.nextInt();
		 QF qf = new QF(N);
		
		while(sc.hasNext()){
			int p= sc.nextInt();
			int q = sc.nextInt();
			
			if(!qf.find(p, q)){
				qf.union(p, q);
			}		
		}
		qf.print();
		 }catch (IOException e) {System.out.println("ERROR");}
		 finally {sc.close();}
		
		
	}

}
