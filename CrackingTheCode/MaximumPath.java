package CrackingTheCode;

public class MaximumPath {
	public class Result{
		public int val;
	}
	public int pathSum(Node root){
		Result res=new Result();
		res.val=Integer.MIN_VALUE;
		pathSum(root,res);
		return res.val;
	}
	public int pathSum(Node root,Result max){
		if(root==null)
			return 0;
		int l=pathSum(root.lc,max);
		int r=pathSum(root.rc,max);
		int max_range=Math.max(Math.max(l, r)+root.data,root.data);
		System.out.print(max_range+" ");
		int max_curve=Math.max(max_range,l+r+root.data);
		System.out.print(max_curve+" ");
		max.val=Math.max(max.val,max_curve);
		System.out.println(max.val);
		return max_range;
	}
	public static void main(String[] args) {
		MaximumPath mp=new MaximumPath();
		Node n=new Node();
		Node n1=n.constructBinaryTree();
		System.out.println(mp.pathSum(n1));
	}
	

}
