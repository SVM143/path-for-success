package Graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class BinaryHeap<T> {
	LinkedHashMap<Integer,Node> hm=new LinkedHashMap<Integer,Node>();
	ArrayList<Node>al=new ArrayList<Node>();
	public class Node{
		T a;int weight;
		Node(T a,int weight){
			this.a=a;
			this.weight=weight;
		}
	}
	public void add(T a,int n ){
		Node n1=new Node(a,n);
		hm.put(n,n1);
		al.add(n1);
	}
	
	public  void buildHeap(){
		for(int i=al.size()/2-1;i>=0;i--){
			int l=2*i+1;
			int r=2*i+2;
			min_heap(i,al,l,r);
		}
	}
	public void min_heap(int i,ArrayList<Node>all,int l,int r){
		if(l<hm.size()&&hm!=null&&all.get(l).weight<all.get(i).weight){
			Node temp=all.get(l);
			all.set(l,all.get(i));
			all.set(i,temp);
		}
		if(l<hm.size()&&hm!=null&&all.get(r).weight<all.get(i).weight){
			Node temp=all.get(l);
			all.set(r,all.get(i));
			all.set(i,temp);
		}
		return;
	}
	public void deleteMIn(){
		al.remove(0);
		buildHeap();
	}
	
	public void decrease(T a,int n){
		LinkedHashMap<T,Integer> jo=new LinkedHashMap<T,Integer>();
		if(al.contains(a))
			for(int i=0;i<al.size();i++)
			jo.put(a,i);
		else
			return;
		al.get(jo.get(a)).weight=n;
		buildHeap();
	}
	public int getIndex(int n){
		return 0;
	}
	public void display(){
		for(int i=0;i<al.size();i++){
			if(al==null)
				break;
			System.out.println(al.get(i).weight+" "+al.get(i).a);
		}
	}
}
