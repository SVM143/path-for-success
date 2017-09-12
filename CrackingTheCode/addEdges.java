package CrackingTheCode;

import java.util.HashMap;

public class addEdges {
	
	graph<String,String,Integer> ad=new graph<String,String,Integer>();
	
	HashMap<String,String>al=new HashMap<>();
	
	public void planet(int p1,int p2){
				
	}
	
	public void connectEdges(String s,String s2){
		
		ad.addEdge(s, s2, 1);
	}
	
	public void cal(int nextInt, int nextInt2, int nextInt3, int nextInt4) {
		// TODO Auto-generated method stub
		
		connectEdges("p"+nextInt2+nextInt,"p"+nextInt4+nextInt3);
		
	}
	
	public void query(int nextInt, int nextInt2, int nextInt3, int nextInt4) {
		// TODO Auto-generated method stub
		//System.out.println(nextInt+" "+nextInt2+" "+nextInt3+" "+nextInt4);
	}
	
	public void check(int n){
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=n-1;j++){
				String a="p"+i+j;
				String a2="p"+i+(j+1);
				ad.addEdge(a,a2,1);
			}
		}
	}
	
	public graph<String,String,Integer> allEdges(){
		return ad;
	}
}


/*
3 3 3
1 2
2 3
1 1 1 2
3 3 3 2
1 2 3 3
2 1 2 2
2 1 2 3
1 2 3 2

*/