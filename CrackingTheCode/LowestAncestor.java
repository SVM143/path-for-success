package CrackingTheCode;

public class LowestAncestor {
	public class NotBst extends RuntimeException{
		public NotBst(String s){
			super(s);
		}
	}
	
	public class Node{
		int data;Node lc;Node rc;
		Node(int data){
		this.data=data;	
		lc=null;
		rc=null;
		}
	}
	public int height(Node n){
		if(n==null)
			return 0;
		int leftHeight=height(n.lc);
		int rightHeight=height(n.rc);
		if(leftHeight>=rightHeight)
			return leftHeight+1;
		else
			return rightHeight+1;
			
	}
	public int size(Node n){
		if(n==null)
			return 0;
		int leftsize=size(n.lc);
		int rigthsize=size(n.rc);
		return leftsize+rigthsize+1;
	}
	public void print(Node n){
	if(n!=null){
		System.out.println(n.data);
		print(n.lc);
		print(n.rc);
	 }
	}
	public boolean checkBst(Node n,int min,int max){
		if(n==null)
			return true;
		if(n.data<=min||n.data>max){
			throw new NotBst("Not a Binary Search Tree");
		}
			return checkBst(n.lc,min,n.data)&&checkBst(n.rc,n.data,max);
	}
	public Node commonAncestor(Node root,Node n1,Node n2){
		if(root==null)
			return null;
		if(root==n1||root==n2)
			return root;
		Node left=commonAncestor(root.lc,n1,n2);
		Node right=commonAncestor(root.rc,n1,n2);
		if(left!=null&&right!=null)
			return root;
		if(left==null&&right==null)
			return null;
		return left!=null?left:right;
	}
	public void NonIterativeOrder(Node n){
		Node current=n;
		while(current!=null){
			if(current.lc==null){
				System.out.println(current.data+" ");
				current=current.rc;
			}
			else{
				Node child=current.lc;
			 while(child.rc!=current&&child.rc!=null)
				child=child.rc;
			
			if(child.rc==null){
				child.rc=current;
				current=current.lc;
			}
			else{
				child.rc=null;
				System.out.println(current.data+" ");
				current=current.rc;
			}
			}
		}
			
	}
	public void LargeBst(Node n){
		
	}
	public static void main(String[] args) {
	LowestAncestor lw=new LowestAncestor();
	Node n=lw.new Node(5);
	n.lc=lw.new Node(27);
	n.rc=lw.new Node(9);
	n.lc.lc=lw.new Node(6);
	n.lc.rc=lw.new Node(28);
	n.lc.rc.rc=lw.new Node(45);
	n.rc.rc=lw.new Node(34);
	n.rc.lc=lw.new Node(56);
//	System.out.println(lw.size(n));
//	System.out.println(lw.height(n));
//	try{
//	System.out.println(lw.checkBst(n,Integer.MIN_VALUE,Integer.MAX_VALUE));
//	}
//	catch(NotBst e){
//		System.out.println(e.getMessage());
//	}
//	System.out.println(lw.commonAncestor(n,n.lc.rc,n.rc.lc).data);
	//lw.NonIterativeOrder(n);
	lw.LargeBst(n);
	}

}
