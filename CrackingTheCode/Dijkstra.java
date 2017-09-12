package CrackingTheCode;

import java.util.HashMap;
import java.util.Map;

public class Dijkstra {
	Map<Character, Integer> distance=new HashMap<Character,Integer>();
	Map<Character, Character> parent=new HashMap<Character,Character>();
	public void shortPath(graph<Character,Character,Integer> g,char a){
		BinaryHeapLatest<Character,Integer> minHeap=new BinaryHeapLatest<Character,Integer>();
		
		for(char b:g.getallVertex()){
			minHeap.add(b,Integer.MAX_VALUE);
		}
		minHeap.decrease(a,0);
		parent.put(a,null);
		while(!minHeap.empty()){
			BinaryHeapLatest<Character,Integer>.Node heapNode=minHeap.ExtractMinNode();
			char current=heapNode.a;
			distance.put(current, heapNode.weight);
			graph<Character,Character,Integer>.Node n3=g.hm.get(current);
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
	public static void main(String[] args) {
		graph<Character,Character,Integer> ad=new graph<Character,Character,Integer>();
		ad.addEdge('A','B',5);
		ad.addEdge('A','D',9);
		ad.addEdge('A','E',2);
		ad.addEdge('B','C',2);
		ad.addEdge('D','C',3);
		ad.addEdge('D','F',2);
		ad.addEdge('E','F',3);
		Dijkstra j=new Dijkstra();
		j.shortPath(ad,ad.getVertex());
		j.print();
	}

}
