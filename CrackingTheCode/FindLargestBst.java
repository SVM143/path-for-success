package CrackingTheCode;

import java.util.Queue;

public class FindLargestBst {

	public class Node{
		int data;Node lc;Node rc;int size;int low;int high;
		Node(int data){
		this.data=data;	
		lc=null;
		rc=null;
		size=0;
		low=Integer.MIN_VALUE;
		high=Integer.MAX_VALUE;
		}
	}
	public class MinMax{
	Node n;boolean isBst;int max,min,size;boolean bst;
		MinMax(){
		n=null;
		isBst=true;
		max=Integer.MAX_VALUE;
		min=Integer.MIN_VALUE;
		size=0;
		}
	}
	
	public Node Preorder(Node n){
		if(n==null)
			return null;
		Node left=Preorder(n.lc);
		Node right=Preorder(n.rc);
	//	System.out.println(left.data);
	//	System.out.println(right.data);
	//	createNode(left,right,n);
		//MinMax m=largestBST(n);
	//	System.out.println(m.size);
	//	System.out.println(m.n.data);
		Node m=new Node(n.data);
		
		if(left!=null&&right!=null&&n.data>left.data&&n.data<right.data){
			m.size=left.size+right.size+1;
			m.high=right.data;
			m.low=left.data;
			return n;
		 } 
		else {
			if(left==null&&right==null){
			m.size=0;
			m.low=0;
			m.high=0;
			return m;
			}
			else{
				Node p=left==null?right:left;
				m.size=p.size+1;
				m.low=p.low;
				m.high=p.high;
				return m;
			}
		}
	}
	public Node createNode(Node left,Node right,Node n){
		Node m=new Node(n.data);
		
		if(n.data>left.data&&n.data<right.data){
			m.size=left.size+right.size+1;
			m.high=right.data;
			m.low=left.data;
			return n;
		 } 
		else {
			if(n.lc==null&&n.rc==null){
			m.size=0;
			m.low=0;
			m.high=0;
			return m;
			}
			else{
				Node p=left==null?left:right;
				m.size=p.size+1;
				m.low=p.low;
				m.high=p.high;
				return m;
			}
		}
			
			
			
	}
	 public MinMax largestBST(Node root){
	        MinMax m = largest(root);
	        return m;
	    }
	    
	 public MinMax largest(Node root){
	
	     if(root == null)
	       return new MinMax();
	     MinMax leftMinMax=largest(root.lc);
	     MinMax rightMinMax=largest(root.rc);
	     MinMax m=new MinMax();
	     
	     if(leftMinMax.isBst == false || rightMinMax.isBst == false || (leftMinMax.max > root.data || rightMinMax.min <= root.data)){
	            m.isBst = false;
	            m.size = Math.max(leftMinMax.size, rightMinMax.size);
	            m.n=root;
	            return m;
	        }
	     m.isBst = true;
	     m.size = leftMinMax.size + rightMinMax.size + 1;
	     m.min = root.lc != null ? leftMinMax.min : root.data;
	     m.max = root.rc != null ? rightMinMax.max : root.data;
	     m.n=root;
	     return m;
	 }
	 Queue<Node> qu=new Queue<Node>();
	public static void main(String[] args) {
		FindLargestBst lw= new FindLargestBst();
		Node n=lw.new Node(25);
		n.lc=lw.new Node(18);
		n.rc=lw.new Node(50);
		n.lc.lc=lw.new Node(19);
		n.lc.lc.rc=lw.new Node(15);
		n.lc.rc=lw.new Node(20);
		n.lc.rc.lc=lw.new Node(18);
		n.lc.rc.rc=lw.new Node(25);
		
		n.rc.lc=lw.new Node(35);
		n.rc.rc=lw.new Node(60);
		n.rc.lc.lc=lw.new Node(55);
		n.rc.lc.rc=lw.new Node(70);
		n.rc.lc.rc=lw.new Node(40);
		n.rc.lc.lc=lw.new Node(20);
		n.rc.lc.lc.rc=lw.new Node(25);
		Node l=lw.Preorder(n);
		System.out.println(l.size);
		//Node root=lw.largestBinaryTree(n,0);
		
		//System.out.println(MinMax.);
	}

}
