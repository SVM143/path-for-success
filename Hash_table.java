package StringPrograms.GeekForGeeks;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

public class Hash_table{
	ArrayList<Node>al=new ArrayList<Node>();
	TreeMap<Integer,ArrayList<Node>> tm=new TreeMap<Integer,ArrayList<Node>>();
	Node root;
	static class Node{
		int key;Node left;Node right;
		
		Node(int key){
			this.key=key;
			left=null;
			right=null;
		}
	}
	Hash_table(){
		root=null;
	}
	public void printVerticalOrder(Node root,int val){
		print(root,tm,val);
		 for(Map.Entry<Integer,ArrayList<Node>> entry :tm.entrySet()) {
             ArrayList<Node> list = entry.getValue();
             
             for(Node treeNode:list){
                 System.out.print(treeNode.key + " ");
             }
             System.out.println();
        }
}
	public void print(Node root,TreeMap<Integer,ArrayList<Node>> tm,int val){
		if(root==null)
			return;
		if(tm.containsKey(val))
			tm.get(val).add(root);
		else{
		ArrayList<Node> list = new ArrayList<>();
        list.add(root);
        tm.put(val,list);
       }	
		if(root.left!=null){
			print(root.left,tm,val-1);
		}
		if(root.right!=null){
			print(root.right,tm,val+1);
		}
	}
	
	public static void main(String args[]){
		Hash_table treeobj=new Hash_table();
				treeobj.root=new Node(1);
				treeobj.root.left=new Node(2);
				treeobj.root.left.left=new Node(4);
				treeobj.root.left.right=new Node(5);
				treeobj.root.right=new Node(3);
				treeobj.root.right.left=new Node(6);
				treeobj.root.right.right=new Node(7);
				treeobj.root.right.left.right=new Node(8);
				treeobj.root.right.right.right=new Node(9);
				treeobj.printVerticalOrder(treeobj.root,0);
	}
}











//import java.util.*;
//import java.util.Map.Entry;
//
//public class VerticalViewTree {
//	Node root; 
//	ArrayList<Integer> arr=new ArrayList<>();
//	static Map<Integer,ArrayList<Integer>> mymap=new LinkedHashMap<Integer, ArrayList<Integer>>();
//
//	static class Node
//	{
//		int key;
//		Node left;
//		Node right;
//		
//		public Node(int i)
//		{
//			this.key=i;
//			left=null;
//			right=null;
//		}
//	}
//	
//	VerticalViewTree(){
//		root=null;
//	}
//	
//	VerticalViewTree(int key){
//		root=new Node(key);
//	}
//	
//	public Map<Integer,ArrayList<Integer>> findMinMax(Node root, int val){
//		if(root.left!=null){
//			findMinMax(root.left, val-1);
//		}
//		
//		ArrayList<Integer> arrlist=new ArrayList<Integer>();
//		if(mymap.get(val)!=null){
//			
//			arrlist=mymap.get(val);
//			arrlist.add(root.key);
//			
//		}
//		else{
//			arrlist.add(root.key);
//		}
//	
//		mymap.put(val, arrlist);
//		
//		
//		if(root.right!=null){
//			findMinMax(root.right, val+1);
//		}
//		
//		return mymap;
//	}
//	
//	public void printTree(Node root){
//		if(root==null){
//			return;
//		}
//		
//		Map<Integer,ArrayList<Integer>> map=findMinMax(root, 0);
//		
//		for(Entry<Integer,ArrayList<Integer>> e: map.entrySet()){
//			ArrayList<Integer> arr=e.getValue();
//			for(Integer i:arr){
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//	
//
//	public static void main(String[] args) {
//		
//		VerticalViewTree treeobj=new VerticalViewTree();
//		treeobj.root=new Node(1);
//		treeobj.root.left=new Node(2);
//		treeobj.root.left.left=new Node(4);
//		treeobj.root.left.right=new Node(5);
//		treeobj.root.right=new Node(3);
//		treeobj.root.right.left=new Node(6);
//		treeobj.root.right.right=new Node(7);
//		treeobj.root.right.left.right=new Node(8);
//		treeobj.root.right.right.right=new Node(9);
//		
//		treeobj.printTree(treeobj.root);
//		
//	}
//
//}





































