import java.util.*;

public class ThreeStacks {
	
	int[][] threeStackArray;
	int[] threeStackPointer;
	
	ThreeStacks(){
		threeStackArray = new int[3][100];
		for(int i=0; i<3; i++){
			Arrays.fill(threeStackArray[i], 0);
		}
		
		threeStackPointer = new int[3];
		Arrays.fill(threeStackPointer, -1);
	}
	
	public boolean push(int num, int stackIndex){
		if(stackIndex<3){
			threeStackPointer[stackIndex] = threeStackPointer[stackIndex] + 1;
			threeStackArray[stackIndex][threeStackPointer[stackIndex]] = num;
			return true;
		}
		return false;
	}
	
	public int pop(int stackIndex){
		if(threeStackPointer[stackIndex] > 0){
			int v = threeStackArray[stackIndex][threeStackPointer[stackIndex]];
			threeStackArray[stackIndex][threeStackPointer[stackIndex]] = 0;
			threeStackPointer[stackIndex] = threeStackPointer[stackIndex] - 1;
			return v;
		}
		return 0;
	}
	
	public int peek(int stackIndex){
		return threeStackArray[stackIndex][threeStackPointer[stackIndex]];
	}
	
	public boolean isEmpty(int stackIndex){
		return (threeStackPointer[stackIndex] < 0);
	}
	
	public static void main(String s[]){
		
		ThreeStacks ts = new ThreeStacks();
		ts.push(25, 0);
		ts.push(50, 1);
		ts.push(100, 2);
		ts.push(250, 0);
		ts.push(500, 1);
		ts.push(1000, 2);
		
		System.out.println(ts.peek(0));
		System.out.println(ts.pop(1));
		System.out.println(ts.isEmpty(2));
	}
}
