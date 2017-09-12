package Graph;
import java.util.*;
import java.util.HashMap;

public class MyDisjointSet {	
	
	int size;HashMap<Character,Node> hs;TreeSet<comp>ts;
	
	public MyDisjointSet(){
		hs=new HashMap<Character,Node>();
		ts=new TreeSet<comp>(new MyComparator());
	}
	
	public class Node{
		Node parent;char a;int rank;
		Node(char a){
			this.a=a;
			parent=null;
			rank=0;
		}
	}

	public void makeSet(char a){
		Node n=new Node(a);
		n.parent=n;
		hs.put(a,n);
	}
	
	public boolean union(char c,char d){
		Node n1=hs.get(c);
		Node n2=hs.get(d);
		
		Node parent1=findSet(n1);
		Node parent2=findSet(n2);
		
		 if (parent1.a == parent2.a) 
	            return false;

	        //else whoever's rank is higher becomes parent of other
	        if (parent1.rank >= parent2.rank) {
	            //increment rank only if both sets have same rank
	            parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
	            parent2.parent = parent1;
	            System.out.println(c+""+d);
	        } else {
	            parent1.parent = parent2;
	            System.out.println(c+""+d);
	        }
	        return true;
	}
	
	public Node findSet(Node n){
		Node p=n.parent;
		if(p==n)
			return p;
		return findSet(n.parent);
	}
	
	
	public class comp{
		char a,b;int i;
		comp(char a,char b,int i){
			this.a=a;
			this.b=b;
			this.i=i;
		}
	}
	
	
	public boolean calc(char a,char b,int i){
		comp c=new comp(a,b,i);
		ts.add(c);
		return true;
	}
	
	
	public class MyComparator implements Comparator<Object>{
		@Override
		public int compare(Object obj1,Object obj2){
			comp i1=(comp)obj1;
			comp i2=(comp)obj2;
			if(i1.i>=i2.i)
				return 1;
			else if(i1.i<i2.i)
				return -1;
			else 
				return 1;
		}
	}
	
	
	public void call(){
		 Iterator<comp> iter= ts.iterator();
		while(iter.hasNext()){
		comp c=iter.next();
		union(c.a,c.b);
		}
	}
	
	
	public static void main(String[] args) {
		MyDisjointSet ds=new MyDisjointSet();
		ds.makeSet('A');
		ds.makeSet('B');
		ds.makeSet('C');
		ds.makeSet('D');
		ds.makeSet('E');
		ds.makeSet('F');
		
		ds.calc('A','B',3);
		ds.calc('A','D',9);
		ds.calc('B','D',3);
		ds.calc('B','C',1);
		ds.calc('D','C',1);
		ds.calc('C','E',5);
		ds.calc('D','E',6);
		ds.calc('C','F',4);
		ds.calc('E','F',2);
		ds.call();
	}

}
