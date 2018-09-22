import java.util.*;

public class StacksNQueue extends Stack<NodeWithMin> {
	
	StacksNQueue(){
		
	}
	public void push(int num){
		int newMin = Math.min(num, min());
		super.push(new NodeWithMin(num,newMin));
	}
	
	private int min() {
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return super.peek().minVal;
		}
	}
	public static void main(String s[]){
		
		StacksNQueue sq = new StacksNQueue();
		
	}
}
