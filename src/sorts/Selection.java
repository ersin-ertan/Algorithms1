package sorts;

public class Selection extends Sort{
	
	public Selection(Comparable[] data){
		this.data = data;
	}
	
	public Comparable[] sortData(){
		int n = data.length;
		
		for(int i = 0; i < n; ++i){
			int min =i;
			for(int j = i+1; j < n; ++j){
				if( less(data[j],data[min]) )
					min = j;
				}
			swap(i, min);
		}
		return data;
	}
	
}
