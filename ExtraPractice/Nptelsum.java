package ExtraPractice;

import java.util.Scanner;
public class Nptelsum {
	Node a[];
	Node root=null;
	public class Node{
		Node rc,lc;int data,pos;
		Node(){
			lc=null;
			rc=null;
			data=0;
			pos=0;
		}
	}
	public void Bst(int data,int pos){
			Node n=new Node();
			n.data=data;
			n.pos=pos;
			if(root==null){
				root=n;
				return ;
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
			 return ;
	}
	public void cal(Node root,int size){
		a=new Node[size];
		display(root,size);
		for(Node t:a){
			if(t!=null)
			System.out.println(t.data);
		}
	}
	public void display(Node root,int size){
		if(root==null)
			return;
		display(root.lc,size);
		a[--size]=root;
		//System.out.println(a[size].data);
		display(root.rc,size);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Nptelsum np=new Nptelsum();
		int sum=0,size=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			 sum=sc.nextInt();
			 size=sc.nextInt();
			for(int j=1;j<=size;j++){
				np.Bst(sc.nextInt(),j-1);
			}
		   // np.cal(np.root,size);
		     np.cal(np.root,size);
//			for(Node t:a){
//				System.out.println(t.data+" "+t.pos);
//			}
		}
	}

}
