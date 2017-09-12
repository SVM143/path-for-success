package CrackingTheCode;
// level + height
import java.util.ArrayList;
import java.util.LinkedList;

import TreeDataStructure.java.Queue;

public class treeLevel {
	Node root;Queue<Node> q=new Queue<>();ArrayList<LinkedList<Node>>al=new ArrayList<>();
	treeLevel(){
		root=null;
	}
class NotBalancedTree extends RuntimeException{
	//String message="Not a Balaced Tree";
	 public NotBalancedTree(String message){
	        super(message);
	    }
	}
	public class Node{
		Node left,right;int data;
		boolean isVisited;
		Node(int data){
			right=null;
			this.data=data;
			left=null;
			isVisited=false;
		}
	}
	public void printTree(Node r){
		Node n=r;
		if(n!=null){
			printTree(n.left);
			System.out.println(n.data);
			printTree(n.right);
		}
	}
	public Node FindNode(int data){
		if(root.data==data)
			return root;
		Node c=root;
		while (c!= null) {
			if(c.data==data)
				break;
			if(data<c.data)
				c=c.left;
			else 
				c=c.right;
		}
			return c;
	}
	public void insertNode(int data){
		Node n=new Node(data);
		if(root==null){
			root=n;
			return;
		}
		Node c=root;
		Node p=root;
		while (c!= null) {
			//System.out.println(data);
			p=c;
			if(data<c.data)
				c=c.left;
			else
				c=c.right;
		}
			if(data<p.data)
				p.left=n;
			else
				p.right=n;
	}
	public ArrayList<LinkedList<Node>> displayNodeLevel(Node root){
		LinkedList<Node>current=new LinkedList<Node>();
		if(root!=null){
			current.add(root);
		}
		while(current.size()>0){
			al.add(current);
			LinkedList<Node>parent=current;
			current=new LinkedList<>();
			for(Node n:parent){
				if(n.left!=null)
					current.add(n.left);
				if(n.right!=null)
					current.add(n.right);
			}
		}
		return al;
	}
	public void display(ArrayList<LinkedList<Node>> ll){
		for(int i=0;i<ll.size();i++){
			for(Node n:ll.get(i)){
				System.out.print(n.data+" ");
			}
			System.out.println();
		}
	}
	public int checkBalanceTree(Node root){
		if(root==null)
			return -1;
		int leftHeight=checkBalanceTree(root.left);
				
		int rightHeight=checkBalanceTree(root.right);
		
		int height=leftHeight-rightHeight;
		if(Math.abs(height)>1)
			throw new NotBalancedTree("Not a Balanced Tree");		
		else
			return Math.max(leftHeight, rightHeight)+1;
	}
	public static void main(String[] args) {
	treeLevel t=new treeLevel();
	t.insertNode(5);
	t.insertNode(4);
	t.insertNode(8);
	t.insertNode(2);
	t.insertNode(9);
	t.insertNode(6);
	t.insertNode(67);
	t.insertNode(12);
	t.printTree(t.root);
	t.display(t.displayNodeLevel(t.root));
	try{
	if(t.checkBalanceTree(t.root)<0)
		System.out.println("not balanced");
	else
		System.out.println("balanced tree");
	 }
	catch(NotBalancedTree e){
		System.out.println(e.getMessage());
	}
 }
}