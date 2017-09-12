package TreeDataStructure.java;

public class Bst {
	Node root; Node lc;Node rc;
	Bst(){
		root=null;	
	}
	class Node{
		Node lc;
		Node rc;
		int data;
		Node(){
			lc=null;
			rc=null;
		}	
	}
	// INSERT THE NODE
	public boolean InsertNode(int data){
		Node n=new Node();
		n.data=data;
		if(root==null){
			root=n;
			return true;
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
		 return true;
	}
	public void DisplayNode(Node root){
		Node p = root;
		if(p!=null){
			DisplayNode(p.lc);
			System.out.println(" "+p.data);
			DisplayNode(p.rc);
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
				c=c.lc;
			else 
				c=c.rc;
		}
			return c;
	}
	public boolean DeleteNode(int data){
		Node c=root;Node p=root;boolean leftChild=true;
		while (c!= null) {
			p=c;
			if(c.data==data)
				break;
			if(data<c.data){
				leftChild=true;
				c=c.lc;
				}
			else {
				c=c.rc;
				leftChild=false;
			}
		}
			if(c==null)
				return false;
			else if(c.lc==null&&c.rc==null){
				if(c==root)
					root=null;
				else if(leftChild)
					p.lc=null;
				else
					p.rc=null;
				return true;
			}
			else if(c.lc==null){
				if(c==root)
					root=c.rc;
				if(leftChild)
					p.lc=c.rc;
				else
					p.rc=c.rc;
				return true;
			}
			else if(c.rc==null){
				if(c==root)
					root=c.lc;
				if(leftChild)
					p.lc=c.lc;
				else
					p.rc=c.lc;
				return true;
			}
			else if(c.lc!=null&&c.rc!=null){
				Node s=getSuccessor(c);
				if(c==root)
					root=s;
				else if(leftChild)
					p.lc=s;
				else
					p.rc=s;
				s.lc=c.lc;
				return true;
			}			
			else
				return false;
		
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

	public static void main(String[] args) {
	Bst t=new Bst();
	t.InsertNode(5);
	t.InsertNode(4);
	t.InsertNode(8);
	t.InsertNode(2);
	t.InsertNode(9);
	t.DisplayNode(t.FindNode(5));
	t.DeleteNode(8);
	System.out.println();
	t.DisplayNode(t.FindNode(5));
	}

}
