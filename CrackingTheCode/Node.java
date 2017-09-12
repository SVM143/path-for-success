package CrackingTheCode;

public class Node {
	Node root=null;
	int data;Node lc;Node rc;int size;int low;int high;
	Node(){
		
	}
	Node(int data){
	this.data=data;	
	lc=null;
	rc=null;
	size=0;
	low=Integer.MIN_VALUE;
	high=Integer.MAX_VALUE;
	}
	public Node constructBinaryTree(){
		Node root=new Node(-15);
//		n.lc=new Node(27);
//		n.rc=new Node(-190);
//		n.lc.lc=new Node(6);
//		n.lc.rc=new Node(28);
//		n.lc.rc.rc=new Node(45);
//		n.rc.rc=new Node(34);
//		n.rc.lc=new Node(56);
		root.lc=new Node(5);
	    root.rc = new Node(6);
	    root.lc.lc = new Node(-8);
	    root.lc.rc = new Node(1);
	    root.lc.lc.lc = new Node(2);
	    root.lc.lc.rc = new Node(6);
	    root.rc.lc = new Node(3);
	    root.rc.rc = new Node(9);
	    root.rc.rc.rc = new Node(0);
	    root.rc.rc.rc.lc = new Node(4);
	    root.rc.rc.rc.rc = new Node(-1);
	    root.rc.rc.rc.rc.lc = new Node(10);
		return root;
		
	}
	public void bst(){
		insertNode(5);
		insertNode(4);
		insertNode(8);
		insertNode(2);
		insertNode(9);
		insertNode(6);
		insertNode(67);
		insertNode(12);
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
			p=c;
			if(data<c.data)
				c=c.lc;
			else
		  		c=c.rc;
		  }
			if(data<p.data)
				p.lc=n;
			else
				p.rc=n;
	    }
}
