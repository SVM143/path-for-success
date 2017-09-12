package Search_Sorting;

public class queue {
	int front;int rear;int size;int a[];
	queue(int n){
		a=new int[n];
		size=n;
		front=-1;
		rear=0;
	}
	public boolean insert(int n){
		if(isFull())
			return false;
		else{
			a[++front]=n;
			return true;
		}
	}
	public int pop(){
		return a[rear++];
	}
	public boolean isFull(){
		return (front==size-1);
	}
	public boolean isEmpty(){
		return (rear>front);
	}
	public int peek(){
		return a[front];
	}
	public static void main(String[] args) {
	queue st=new queue(5);
	st.insert(3);
	st.insert(1);
	st.insert(8);
	st.insert(2);
	st.insert(5);
	System.out.println(st.peek());
	while(!st.isEmpty()){
		System.out.println(st.pop());
	 }
	}

}
