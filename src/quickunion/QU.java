 package quickunion;

public class QU {
	int[] set;
	
	public QU(int n){
		set = new int[n];
		for(int i = 0; i < n; ++i)
			set[i] = i;
	}
	
	private int root(int i){
		while(i != set[i]) set[i] = i;
		return i; //until it is pointing to itself
	}
	
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		if (i == j) return;
		set[i] = j;
	}
	
	public void print(){
		for(int i : set)
			System.out.println(set[i]);
	}

}
