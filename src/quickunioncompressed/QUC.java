package quickunioncompressed;

public class QUC {
	int[] set;
	
	public QUC(int n){
		set = new int[n];
		for(int i = 0; i < n; ++i)
			set[i] = i;
	}
	
	private int root(int i){
		while(i != set[i]){
			set[i] = set[set[i]]; // this is the line of compression where the next node == the next node's root until it hits the root node, like a next's pointer...
			set[i] = i; // now the tree is flattened and the searches will find the root much faster without having to go though the whole tree since it is already pointing to it
		}
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
