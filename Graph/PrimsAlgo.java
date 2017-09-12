package Graph;

import java.util.ArrayList;
import java.util.HashMap;


import TreeDataStructure.java.minHeap;


public class PrimsAlgo {
	
	
	HashMap<Character,Vertex<Character>> tm;
	ArrayList<Edge> allEdge=new ArrayList<Edge>();
	minHeap<Character> mh=new minHeap<Character>();
	ArrayList al=new ArrayList();
	PrimsAlgo(){
		tm=new HashMap<Character,Vertex<Character>>();
	}
	
	
	
	//---------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------
	
	
	
	public class Edge{
		Vertex<Character> a,b;int w;
		Edge(Vertex<Character> a,Vertex<Character> b,int w){
			this.a=a;
			this.b=b;
			this.w=w;
		}
	}
	

	//---------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------
	
	
	public class Vertex<T> {
		char a;    
		ArrayList<Edge> edges = new ArrayList<Edge>();
	    ArrayList<Vertex<Character>> adjacentVertex = new ArrayList<Vertex<Character>>();
	    
		public Vertex(char a){
		this.a=a;
		}
		 public void addAdjacentVertex(Edge e, Vertex<Character> v){
		        edges.add(e);
		        adjacentVertex.add(v);
		    }
	   }
	

	public void addEdge(char a,char b,int n){
		Vertex<Character> v1=null;
		if(tm.containsKey(a))
			v1=tm.get(a);	
		else{
			v1=new Vertex<Character>(a);
			tm.put(a,v1);
		}
		Vertex<Character> v2=null;
		if(tm.containsKey(b))
			v2=tm.get(b);
		else{
			v2=new Vertex<Character>(b);
			tm.put(b,v2);
		}
		Edge edge = new Edge(v1,v2,n);
		allEdge.add(edge);
		v1.addAdjacentVertex(edge, v2);
		v2.addAdjacentVertex(edge, v1);
      
   }	
	
	
	//---------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------
	
	public void calc(){
		for(Vertex<Character> v:tm.values())
			mh.insert(v.a,Integer.MAX_VALUE);
	}
	
	public void main1(){
		Vertex<Character> start = tm.values().iterator().next();
		mh.decrease(0,start.a);
		
		while(!mh.empty()){
			Vertex<Character> current=new Vertex<Character>(mh.Extractmin());
			
		}
	}
	
	public static void main(String[] args) {
		PrimsAlgo pa=new PrimsAlgo();
		pa.addEdge('A','B',3);
		pa.addEdge('A','D',1);
		pa.addEdge('B','D',3);
		pa.addEdge('B','C',1);
		pa.addEdge('D','C',1);
		pa.addEdge('C','E',5);
		pa.addEdge('D','E',6);
		pa.addEdge('C','F',4);
		pa.addEdge('E','F',2);
		pa.main1();
		//pa.calc();
	}

}
