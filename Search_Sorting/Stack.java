package Search_Sorting;

public class Stack {
	int a[],b[];int top, size,min,t;
	public Stack(int n){
		size=n;
		a=new int[size];
		top=-1;
		min=0;
		t=0;
		b=new int[size];	
	}
	public boolean insert(int n){
		if(isFull())
			return false;
		else{
			a[++top]=n;
			return true;
		}
	}
	public boolean isEmpty(){
		if(top<0)
			return true;
		else
			return false;			
	}
	public int pop(){
		return a[top--];
	}
	public int peek(){
		return a[top];
	}
	public void sort(Stack s){
		Stack n=new Stack(4);
		while(!s.isEmpty()){
			int temp=s.pop();
			while(!n.isEmpty()&&n.peek()>temp)
				s.insert(n.pop());
			n.insert(temp);
		}
		while(!n.isEmpty())
			s.insert(n.pop());
	}
	public boolean isFull(){
		if(size-1>=top)
			return false;
		else
			return true;
	}
	public void display(Stack s){
		while(!s.isEmpty()){
		System.out.println(s.pop());	
		}
	}
	public static void main(String[] args) {
		Stack st=new Stack(4);
		st.insert(5);
		st.insert(6);
		st.insert(3);
		//System.out.println(st.peek());
		st.insert(7);
		//st.sort(st);
		st.display(st);
	}
}
