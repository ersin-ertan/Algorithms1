package doublestack;
import java.util.*;
public class DoubleStack {
	Stack<String> ops = new Stack<String>();
	Stack<Integer> vals = new Stack<Integer>();
	
	String line;
	
	public DoubleStack(){
	}
	
	public void readItem(String item){
		switch(item){
		case "(":{break;}
		case "+":{ops.push(item);break;}
		case "*":{ops.push(item);break;}
		case ")":{
			String op = ops.pop();
			
			if(op.equals("+")) vals.push(vals.pop() + vals.pop());
			else vals.push(vals.pop() * vals.pop());
			break;
		}
		default: vals.push(Integer.valueOf(item));
		}
	}
	
	public void printAns(){
		System.out.println(vals.pop());
	}
	
}
