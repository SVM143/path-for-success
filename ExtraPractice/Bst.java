package ExtraPractice;

public class Bst {
	Node root;Node rc,lc;
	
	Bst(){
	root=null;
	}
	
	class Node{
		int data;Node rc,lc;
		Node(int data){
			this.data=data;
			rc=null;
			lc=null;
		}
	}
	public void insert(int data){
		Node n=new Node(data);
		if(root==null){
			root=n;
			return;
		}
		Node p=root;
		Node c=root;
		while(c!=null){
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
	
	public void DeleteFindNode(int data){
		Node c=root;Node p=root;boolean leftChild=true;
		if(root.data==data)
			c=root;p=root;
		while (c.data!=data) {
			p=c;
			if(data<c.data){
				c=c.lc;
				leftChild=true;
			}
			else {
				c=c.rc;
				leftChild=false;
			}
		}
		if(c.rc==null&&c.lc==null){
			if(leftChild)
				p.lc=null;
			else
				p.rc=null;
		}	
		else if(c.rc!=null&&c.lc!=null){	
			Node s=getSuccessor(c);
			if(c==root)
				root=s;
			else if(leftChild)
				p.lc=s;
			else
				p.rc=s;
			s.lc=c.lc;
		}
				
		else if(c.rc==null){
			if(c==root)
				root=root.lc;
			if(leftChild)
				p.lc=c.lc;		
			else
				p.rc=c.lc;
		}
		else if(c.lc==null){
			if(c==root)
				root=root.rc;
			if(leftChild)
				p.lc=c.rc;		
			else
				p.rc=c.rc;
		}
	}
	
	public Node getSuccessor(Node del){
		Node sp=del;Node p=del;Node c=del.rc;
		while(c!=null){
			sp=p;
			p=c;
			c=c.lc;
		}
		if(p!=del.rc){
			sp.lc=p.rc;
			p.rc=del.rc;
		}
		return p;
	}
	public Node FindNode(int data){
		if(root.data==data)
			return root;
		Node c=root;
		while (c!= null) {
			if(c.data==data)
				break;
			if(data<c.data)
				c=c.lc;
			else 
				c=c.rc;
		}
			return c;
	  }
	
	
	public void DisplayNode(Node r){
		Node t = r;
		if(t!=null){
			DisplayNode(t.lc);
			System.out.println(" "+t.data);
			DisplayNode(t.rc);
		}
	}
	public static void main(String[] args) {
		Bst b=new Bst();
		b.insert(50);
		b.insert(30);
		b.insert(70);
		b.insert(20);
		b.insert(40);
		b.insert(60);
		b.insert(80);
		b.DeleteFindNode(50);
		b.DisplayNode(b.root);
		
	}

}
