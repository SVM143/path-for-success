package CrackingTheCode;

public class avlTree {
	public class Node{
		Node left;Node right; int data;int height;int size;
		Node(int data){
		this.data=data;
		left=null;
		right=null;
		height=0;
		size=0;
		}
	}
	public Node roateLeft(Node n){
		Node newNode=n.right;
		n.right=n.right.left;
		newNode.left=n;
		n.height = setHeight(n);
        n.size = setSize(n);
        newNode.height = setHeight(newNode);
        newNode.size = setSize(newNode);
        return newNode;
	}
	public void rotateRight(Node n){
		
	}
	 public int setHeight(Node root){
	        if(root == null){
	            return 0;
	        }
	        return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));
	    }
	    
	    private int setSize(Node root){
	        if(root == null){
	            return 0;
	        }
	        return 1 + Math.max((root.left != null ? root.left.size : 0), (root.right != null ? root.right.size : 0));
	    }
	public Node constructAvlTree(Node n,int i){
			if(n==null)
				return new Node(i);
			else if(i<n.data)
				n.left=constructAvlTree(n.left,i);
			else
				n.right=constructAvlTree(n.right,i);
			int balance=balance(n.left,n.right);
			if(balance>1){
				if(height(n.left.left)>=height(n.left.right))	
				   rotateRight(n);
				else{
					rotateLeft(n.left);
					
				}
			  }
			else if(balance<-1){
				
			}
			else{
				
			}
				
			return n;
	}
	public void inOrder(Node n){
		if(n==null)
			return;
			System.out.println(n.data);
			inOrder(n.left);
			inOrder(n.right);
	}
	public int height(Node n){
		if(n==null)
			return 0;
		int left=height(n.left)+1;
		int right=height(n.right)+1;
		return Math.max(left,right);
		
	}
	public int balance(Node left,Node right){
		return height(left)-height(right);
	}
	public static void main(String[] args) {
		avlTree at=new avlTree();
		Node root=null;
		    root = at.constructAvlTree(root, -10);
	        root = at.constructAvlTree(root, 2);
	        root = at.constructAvlTree(root, 13);
	        root = at.constructAvlTree(root, -13);
	        root = at.constructAvlTree(root, -15);
	        root = at.constructAvlTree(root, 15);
	        root = at.constructAvlTree(root, 17);
	        root = at.constructAvlTree(root, 20);
	        
	      at.inOrder(root);
	     System.out.println(at.height(root));
	}

}
