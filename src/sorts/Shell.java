package sorts;

public class Shell extends Sort{
	
	public Shell(Comparable[] data){
		this.data = data;
	}

	public Comparable[] sortData(){ // this shell sort is wrong
		int n = data.length;
		
		int h = 1; // incremental sequence
		while(h < n / 3) h = h* 3+1; // 1, 4, 13, 40
		
		while(h >= 1){
			for(int i = h; i < n; ++i){
				for(int d = i; d >= h && less(data[d], data[d-h]); d-=h)
					swap(d, d-h);
			}
		}
		
		h /= 3;
		
		return data;
	}
}
