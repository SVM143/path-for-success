package CrackingTheCode;

import java.util.ArrayList;
import java.util.HashMap;

public class BinaryHeapLatest<T,X> {
	ArrayList<Node> al=new ArrayList<Node>();
	HashMap<T,Integer> hm=new HashMap<T,Integer>();
	public class Node{
		T a;int weight;
		Node(T a,int weight){
			this.a=a;
			this.weight=weight;
		}
	}
	public void add(T a,int weight){
		Node n=new Node(a,weight);
		al.add(n);
		int size=al.size()-1;
		hm.put(a,size);
	}
	public void min(){
		for(int i=al.size()/2-1;i>=0;i--){
			int l=2*i+1;
			int r=2*i+2;
			if(l<hm.size()&&hm!=null&&al.get(l).weight<al.get(i).weight){
			swap(l,i);
			update(l,i);
			}
			if(r<hm.size()&&hm!=null&&al.get(r).weight<al.get(i).weight){
			swap(r,i);
			update(r,i);
			}
		}
	}
	public void decrease(T a,int weight){
		if(hm.containsKey(a))
				al.get(hm.get(a)).weight=weight;
	}
	public boolean contains(T a){
		return hm.containsKey(a);
	}
	public void update(int u,int i){
		hm.remove(u);
		hm.remove(i);
		hm.put(al.get(i).a,i);
		hm.put(al.get(u).a,u);
	}
	public void swap(int u,int i){
		Node temp=al.get(u);
		al.set(u,al.get(i));
		al.set(i,temp);
	}
	public Node ExtractMinNode(){
		min();
		Node n1=new Node(al.get(0).a,al.get(0).weight);
		if(al.size()==1){
			al.remove(0);
			return n1;
		}
		hm.remove(al.get(0).a);
		al.get(0).a=al.get(al.size()-1).a;
		al.get(0).weight=al.get(al.size()-1).weight;
		al.remove(al.size()-1);
		hm.put(al.get(0).a,0);
		return n1;
	}
	public void printHeap(){
		for(Node n:al)
			System.out.println(n.weight+" "+n.a);
	}
	public boolean empty(){
		return al.size()==0;
	}
	public void forHeap(){
		while(!empty()){
			Node t=ExtractMinNode();
			System.out.println(t.weight+" "+t.a);
		}
	}
	public int ExtractValue(){
		return ExtractMinNode().weight;
	}
	public int  getVertex(T a){
		return al.get(hm.get(a)).weight;
	}
	
	public static void main(String[] args) {
		BinaryHeapLatest<Character,Integer> bh=new BinaryHeapLatest<Character,Integer>();
		bh.add('A',8);
		bh.add('T',4);
		bh.add('C',9);
		bh.add('O',2);
		bh.add('P',1);
		bh.add('Q',3);
		bh.add('Y',7);
		bh.add('G',13);
		bh.printHeap();
		System.out.println(bh.hm);		
		bh.decrease('G',0);
		bh.printHeap();
//		bh.printHeap();
//		System.out.println(bh.ExtractMinNode().a);
//		System.out.println();
//		System.out.println(bh.hm);
		bh.forHeap();
		
	}

}
