package binarysearch;

public class Main {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,13,16,19,22,26,29,31,34,35,37	};
		BS binsearch = new BS();
		int i = binsearch.bs(a, 29);
		System.out.println("done");
	}
}