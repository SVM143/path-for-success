package CrackingTheCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codechef {
	
	Map<String, Integer> distance=new HashMap<String,Integer>();
	Map<String, String> parent=new HashMap<String,String>();
	public void shortPath(graph<String,String,Integer> g,String a){
		BinaryHeapLatest<String,Integer> minHeap=new BinaryHeapLatest<String,Integer>();
		
		for(String b:g.getallVertex()){
			minHeap.add(b,Integer.MAX_VALUE);
		}
		minHeap.decrease(a,0);
		parent.put(a,null);
		while(!minHeap.empty()){
			BinaryHeapLatest<String,Integer>.Node heapNode=minHeap.ExtractMinNode();
			String current=heapNode.a;
			distance.put(current, heapNode.weight);
			graph<String,String,Integer>.Node n3=g.hm.get(current);
			while(n3!=null){
		 		if(!minHeap.contains(n3.a)){
		 			n3=n3.next;
		 			continue;
		 		}
		 		int newDistance=n3.w+distance.get(current);
		 		if(minHeap.getVertex(n3.a)>newDistance){	
		 			minHeap.decrease(n3.a,newDistance);
		 			parent.put(n3.a,current);
		 		}
		 		n3=n3.next;
		 	}
		}
			
	}
	public void print(){
		System.out.println(distance);
		System.out.println(parent);
	}
	public static void main(String args[]){
		addEdges ae=new addEdges();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int q=sc.nextInt();
		for(int i=0;i<n-1;i++){
			ae.planet(sc.nextInt(),sc.nextInt());
		}
		for(int i=0;i<m;i++){
			ae.cal(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		
		for(int i=0;i<q;i++){
			ae.query(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		
		ae.check(n);
		sc.close();
		
		graph<String,String,Integer> ad=ae.allEdges();
		codechef j=new codechef();
		j.shortPath(ad,ad.getVertex());
		j.print();
	}
}
