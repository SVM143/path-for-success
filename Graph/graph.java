package Graph;
import Search_Sorting.Stack;
public class graph {
	
	Node vertex[];int size;int adj[][];int top;Stack s;
	graph(int size){
	this.size=size;
	top=-1;
	vertex=new Node[size];
	adj=new int[size][size];
	for(int i=0;i<size;i++){
		for(int j=0;j<size;j++)
			adj[i][j]=0;		
	}
	s=new Stack(size);
	}
	
	public void insert(char a){
		Node n=new Node(a);
		vertex[++top]=n;
	}
	public void getEdges(int a,int b){
		adj[a][b]=1;
		adj[b][a]=1;
	}
	public void dfs(){
		vertex[0].visit=true;
		displayVertex(0);
		s.insert(0);
		while(!s.isEmpty()){
			int v=getvertex(s.peek());
			
			if(v==-1)
				s.pop();
			else
			{
				vertex[v].visit=true;
				displayVertex(v);
				s.insert(v);
			}
		}
		
	}
	public int getvertex(int v){
		for(int i=0;i<size;i++)
			if(adj[v][i]==1&&vertex[i].visit!=true)
				return i;
			return -1;
	}
	public void displayVertex(int v){
		System.out.println(vertex[v].data);
	}
	public static void main(String[] args) {
	graph g=new graph(5);
	g.insert('A');
	g.insert('B');
	g.insert('C');
	g.insert('D');
	g.insert('E');
	
	g.getEdges(0,1);
	g.getEdges(1,2);
	g.getEdges(0,3);
	g.getEdges(3,4);
	g.dfs();
	}

}
