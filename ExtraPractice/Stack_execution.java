package ExtraPractice;

public class Stack_execution {
	int stack_num[],value[];int top;int stack_capacity;
	Stack_execution(int n){
		stack_capacity=3;
		value=new int[stack_capacity*n];
		stack_num=new int[n];
		top=-1;
	}
	public void push(int stnum,int n)throws Exception{
		if(isFull(stnum))
			//System.out.println("filled");
			throw new Exception();
		else{
			stack_num[stnum]++;
			value[indexTop(stnum)]=n;
		}
	}
	public int indexTop(int stnum){
		return stnum*stack_capacity+stack_num[stnum]-1;
	}
	public boolean isFull(int stnum){
		return stack_num[stnum]==stack_capacity;
	}
	public boolean isEmpty(int s){
		return stack_num[s]==0;
	}
//	public void display(){
//		
//	}
	public int pop(int stack_number)throws Exception{
		if(isEmpty(stack_number))
			throw new Exception();
		int topIndex=indexTop(stack_number);
		int val=value[topIndex];
		value[topIndex]=0;
		stack_num[stack_number]--;
		return val;
		
	}
	public static void main(String[] args)throws Exception {
		Stack_execution se=new Stack_execution(3);
		se.push(0,1);
		se.push(0,2);
		se.push(0,3);
		se.push(0,7);
		se.push(1,4);
		se.push(1,5);
		//System.out.println();
		//System.out.println();
		se.push(2,1);
		se.push(2,2);
		se.push(2,3);
		System.out.println(se.pop(1));
	}

}
