package sorts;

public class Insertion extends Sort{
	
	public Insertion(Comparable[] data){
		this.data = data;
	}
	
	public Comparable[] sortData(){
		for(int i = 0; i<data.length;++i){
			for(int d = i; d > 0; --d){
				if( less(data[d], data[d-1]) )
					swap(d, d-1);
				else break;
			}
		}
		return data;
	}

}
