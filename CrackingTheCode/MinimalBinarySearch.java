package CrackingTheCode;

public class MinimalBinarySearch {

	public class Node{
		Node left,right;int data;
		Node(int data){
		left=null;
		right=null;
		this.data=data;
		}
	}
	public Node minimize(int a[],int start,int end){
		if(end<start)
			return null;
		int mid=(start+end)/2;
		Node n=new Node(a[mid]);
		n.left=minimize(a,start,mid-1);
		n.right=minimize(a,mid+1,end);
		return n;
	}
	public void print(Node n){
		if(n!=null){
			//System.out.println(n.data);
			print(n.left);
			//System.out.println(n.data);
			print(n.right);
			System.out.println(n.data);
		}
	}
	public static void main(String[] args) {
		int a[]=new int [10];
		for(int i=0;i<10;i++)
			a[i]=i;
		MinimalBinarySearch mbs=new MinimalBinarySearch();
		mbs.print(mbs.minimize(a,0,a.length-1));

	}

}
