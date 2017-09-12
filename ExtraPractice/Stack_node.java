package ExtraPractice;

public class Stack_node { 
	Node first;Node last;int key;int size;
	Stack_node(){
		first=null;
		last=null;
		//this.key=key;
		size=0;
	}
	public void push(int data){
		Node n=new Node(data);
		if(first==null)
			first=n;
		else{
			n.next=first;
			first=n;
		  }
	}
	public int pop(){
		int p=first.data;
		first=first.next;
		return p;
	}
	public boolean isEmpty(){
		return first==null;
	}
	public int peek(){
		return first.data;
	}
	public void sort(Stack_node s){
		Stack_node r=new Stack_node();
		while(!s.isEmpty()){
			int temp=s.pop();
			while(!r.isEmpty()&&r.peek()>temp)
				s.push(r.pop());
			r.push(temp);
		}
		while(!r.isEmpty()){
			s.push(r.pop());
		}
	}
	public void display(Stack_node st){
		last=first;
		while(!isEmpty()){
			System.out.println(pop());
		}
	}
	public static void main(String[] args) {
		Stack_node st=new Stack_node();
		st.push(5);
		st.push(6);
		st.push(3);
		st.push(10);
		st.push(7);
		st.push(0);
		st.push(34);
		st.push(12);
		st.push(23);
		st.sort(st);
		st.display(st);
	}
}
