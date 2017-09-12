package TreeDataStructure.java;

import java.util.LinkedList;

public class Queue<T> {
	
	LinkedList<T> ll=new LinkedList<>();
	public void Enqueue(T a){
		ll.add(a);
	}
	public T Dequeue(){
		T t=(T)(ll.get(0));
		ll.remove(0);
		return t;
	}
	public void displayNode(){
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
	}
	public static void main(String[] args) {
		Queue<String> q=new Queue<>();
		q.Enqueue("sourav");
		q.Enqueue("food");
		q.Enqueue("good");
		q.displayNode();
		q.Dequeue();
		System.out.println();
		q.displayNode();
	}

}
