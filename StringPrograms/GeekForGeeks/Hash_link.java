package StringPrograms.GeekForGeeks;

import java.util.Map;
import java.util.TreeMap;

import TreeDataStructure.java.Link_List.link;

public class Hash_link {
	//Link l=new Link();
	TreeMap<Integer,Link> tm=new TreeMap<Integer,Link>();
	Link last;Link first;
		Node root;Link l;
		Hash_link(){
			root=null;
			last=null;
			first=null;
		}
		static class Node{
			Node right,left;int key;
			Node(int key){
				right=null;
				left=null;
				this.key=key;
			}		
		}
		static class Link{
			Link next;Node l;
			 Link(Node n){
				this.l=n;
				this.next=null;
			}
		}
	public void add(Node a){
			Link li=new Link(a);
			if(empty())
			last=li;
			li.next=first;
			first=l; 
		}
	
	public void printVerticalOrder(Node root,int val){
	print(root,tm,val);
			 for(Map.Entry<Integer,Link> entry :tm.entrySet()) {
	             Link list = entry.getValue();
	             
	             while(!list.isEmpty())
	            	 System.out.println(root.key);
	             System.out.println();
	        }
	}
	public void print(Node root,TreeMap<Integer,Link> tm,int val){
		if(root==null)
			return;
		if(tm.containsKey(val))
			tm.get(val).add(root);
		else{
		Link list = new Link();
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

	public static void main(String[] args) {
		Hash_link treeobj=new Hash_link();
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


