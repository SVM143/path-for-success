package CrackingTheCode;
import java.util.Stack;

public class AnyPathSum {
	Stack<Integer> al=new Stack<Integer>();
	public void path(Node root,int sum){
		findPaths(root,sum,al);
	}
	public void printPath(Stack<Integer> al,int i){
		for(int j=i;j<al.size();j++)
			System.out.println(al.get(j));
		System.out.println();
	}
	public void findPaths(Node n,int sum,Stack<Integer> al){
		if(n==null)
			return;
		al.add(n.data);
		findPaths(n.lc,sum,al);
		findPaths(n.rc,sum,al);
		int f=0;
		for(int j=al.size()-1;j>=0;j--){
			f+=al.get(j);
			if(f==sum)
				printPath(al,j);
			//System.out.println(al.get(j));
		}
		al.pop();
	}
	public static void main(String[] args) {
		AnyPathSum aps=new AnyPathSum();
		Node n=new Node();
		Node root=n.constructBinaryTree();
		aps.path(root,5);
	}

}
