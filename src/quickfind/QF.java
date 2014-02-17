package quickfind;

public class QF {
	private int[] set;
	
	public QF(int n){
		set = new int[n];
		for(int i = 0; i < n; ++i)
			set[i]=i;
	}
	
	public boolean find(int p, int q){ 
		return set[p] == set[q];}
	
	public void union(int p, int q){
		int idp = set[p];
		int idq = set[q];
		
		for(int i : set)
			if(set[i] == idp)
				set[i] = idq;
	}
	
	public void print(){
		for(int i : set)
			System.out.println(set[i]);
	}

}
