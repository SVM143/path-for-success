package CrackingTheCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DisjointSet<T> {
	ArrayList<T> al=new ArrayList<>();
	Map<T,Node> hs=new HashMap<>();
	public class Node{
		int rank;Node parent;int weigth;T a;
		Node(T a){
		this.a=a;
		parent=null;
		rank=0;
		}
	}
	public void makeSet(T a){
		Node n=new Node(a);
		n.parent=n;
		hs.put(a,n);
	}
	public boolean union(T a,T b){
		Node n1=hs.get(a);
		Node n2=hs.get(b);
		Node parent1=findSet(n1);
		Node parent2=findSet(n2);
		
		  if (parent1.a == parent2.a) {
	            return false;
	        }
		
		  if (parent1.rank >= parent2.rank) {
	            //increment rank only if both sets have same rank
	            parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
	            parent2.parent = parent1;
	        } else {
	            parent1.parent = parent2;
	        }
	        return true;
	}
	 public T findSet(T data) {
	        return findSet(hs.get(data)).a;
	    }
	private Node findSet(Node node) {
        Node parent = node.parent;
        if (parent == node) {
            return parent;
        }
        node.parent = findSet(node.parent);
        return node.parent;
    }
	public static void main(String[] args) {
		 DisjointSet<Integer> ds = new DisjointSet<Integer>();
	        ds.makeSet(1);
	        ds.makeSet(2);
	        ds.makeSet(3);
	        ds.makeSet(4);
	        ds.makeSet(5);
	        ds.makeSet(6);
	        ds.makeSet(7);

	        ds.union(1, 2);
	        ds.union(2, 3);
	        ds.union(4, 5);
	        ds.union(6, 7);
	        ds.union(5, 6);
	        ds.union(3, 7);

	        System.out.println(ds.findSet(1));
	        System.out.println(ds.findSet(2));
	        System.out.println(ds.findSet(3));
	        System.out.println(ds.findSet(4));
	        System.out.println(ds.findSet(5));
	        System.out.println(ds.findSet(6));
	        System.out.println(ds.findSet(7));
		
	}

}
