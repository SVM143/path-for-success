package ExtraPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;


public class graph<T,X,Y> {
	
	public class Node{
		T a;Node next;int w;T b;
		Node(T a,int w){
		this.a=a;
		this.w=w;
		next=null;
		}
		Node(T a,T b,int weight){
		this.a=a;
		this.b=b;
		this.w=weight;
		}
	}
	
	LinkedHashMap<T,Node> hm=new LinkedHashMap<T,Node>();
	ArrayList<T> al=new ArrayList<T>();
	ArrayList<Node> addEdge=new ArrayList<Node>();
	public void addEdge(T a,T b,int w){
		addEdge.add(new Node(a,b,w));
		if(hm==null){
			hm.put(a,new Node(b,w));
			hm.put(b,new Node(a,w));
		}
		if(hm.containsKey(a)){
			Node p1=new Node(b,w);Node p=hm.get(a);Node n=hm.get(a);
				while(n!=null){
					p=n;
					n=n.next;
				}
				p.next=p1;
		}
		else{
			hm.put(a,new Node(b,w));
			al.add(a);
		}
			
		if(hm.containsKey(b)){
			Node p1=new Node(a,w);Node p=hm.get(b);Node n=hm.get(b);
				while(n!=null){
					p=n;
					n=n.next;
				}
				p.next=p1;
		  }
		else{
			hm.put(b,new Node(a,w));
			al.add(a);
		}
     }
	public ArrayList<Node> getEdges(){
		return addEdge;
	}
	public void printHeap(){
		 for(Map.Entry<T,Node> m:hm.entrySet()){
			   System.out.print(m.getKey());
			   Node n3=(Node)m.getValue();
		 	while(n3!=null){
		 		System.out.print("--->"+n3.a);
		 		n3=n3.next;
		 	}
		 	System.out.println();
		 }
	}
	public Collection<T> getallVertex(){
		return hm.keySet();
	}
	public T getVertex(){
		return al.get(0);
	}
	public int getSize(){
		return al.size();
	}
	public static void main(String[] args) {
		graph<Character,Character,Integer> ad=new graph<Character,Character,Integer>();
		ad.addEdge('A','B',5);
		ad.addEdge('A','D',9);
		ad.addEdge('A','E',2);
		ad.addEdge('B','C',2);
		ad.addEdge('D','C',3);
		ad.addEdge('D','F',2);
		ad.addEdge('E','F',3);
		//System.out.println(ad.hm);
		System.out.println(ad.getVertex());
		ad.printHeap();
	}

}
