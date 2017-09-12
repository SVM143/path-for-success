package CrackingTheCode;

import java.util.HashMap;
import java.util.Map;

public class BellManFord  {
	class NegativeCycleException extends RuntimeException{
		
	}
	public static final int infinity=500;
	Map<Integer, Integer> distance=new HashMap<Integer,Integer>();
	 Map<Integer,Integer> parent = new HashMap<>();

	public void shortPath(graph<Integer,Integer,Integer> g,int a){
		BinaryHeapLatest<Integer,Integer> minHeap=new BinaryHeapLatest<Integer,Integer>();
		for(int b:g.getallVertex()){
			minHeap.add(b,infinity);
			distance.put(b,infinity);
			parent.put(b,null);
		}
		distance.put(a,0);
		
		for(int i=0;i<g.getallVertex().size()-1;i++){
			for(graph<Integer, Integer, Integer>.Edges<Integer> ed:g.getEdges()){
				int v1=ed.a;
				int v2=ed.b;
				
				if(distance.get(v1)+ed.w<distance.get(v2)){
					 distance.put(v2, distance.get(v1) + ed.w);
	                    parent.put(v2, v1);
				}
			}
		
		}
		for(graph<Integer, Integer, Integer>.Edges<Integer> ed:g.getEdges()){
			int u=ed.a;
			int v=ed.b;
			if (distance.get(u) + ed.w < distance.get(v)) {
                throw new NegativeCycleException();
            }
        }
		print(distance);
		
	}
	public void print(Map<Integer, Integer> distance){
		for(Map.Entry<Integer,Integer> hm:distance.entrySet())
			System.out.println(hm.getKey()+" "+hm.getValue());
	}
	public static void main(String[] args) {
		graph<Integer,Integer,Integer> ad=new graph<Integer,Integer,Integer>();
		ad.addEdge(0, 3, 8);
        ad.addEdge(0, 1, 4);
        ad.addEdge(0, 2, 5);
        ad.addEdge(1, 2, -3);
        ad.addEdge(2, 4, 4);
        ad.addEdge(3, 4, 2);
        ad.addEdge(4, 3, 1);
		BellManFord bmf=new BellManFord();
		bmf.shortPath(ad,0);
		//bmf.print();
	}

}
