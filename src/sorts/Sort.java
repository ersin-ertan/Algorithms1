package sorts;

public abstract  class Sort{
	Comparable[] data;
	
	protected boolean less(Comparable v, Comparable w){
		if(v.compareTo(w) < 0) return true;
		return false;
	}
	
	protected void swap( int v, int w){
	Comparable
	swap =	data[v];
				data[v] = data[w];
								data[w]= swap;
	}


	


}
