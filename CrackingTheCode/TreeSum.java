package CrackingTheCode;

import java.util.ArrayList;

public class TreeSum {
	public boolean path(Node n,int sum, ArrayList<Integer> al){
		if(n==null)
			return false;
		if(n.lc==null&&n.rc==null){
			if(n.data==sum&&n!=null){
				al.add(n.data);
				return true;
			}
			else
				return false;			
		}	
		if(path(n.lc,sum-n.data,al)){
			al.add(n.data);
			return true;
		}
		if(path(n.rc,sum-n.data,al)){
		al.add(n.data);
		return true;
		}
		return false;
	}

	public static void main(String[] args) {
	TreeSum ts=new TreeSum();
	Node n=new Node();
	Node t=n.constructBinaryTree();
	ArrayList<Integer> al=new ArrayList<Integer>();
	boolean b=ts.path(t,70,al);
	for(int i:al)
		System.out.println(i);
	}

}
