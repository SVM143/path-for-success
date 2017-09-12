package CrackingTheCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class projectOrder<T,X> {
	
	ArrayList<Node> al=new ArrayList<>();
	Stack<Node> sc=new Stack<Node>();
	HashMap<String,Node> hm=new HashMap<>();
	HashMap<Character,Integer> count=new HashMap<>();
	
	public class Node{
		String a;Node next;int count;
		Node(String a){
			this.a=a;
			this.next=null;
			this.count=0;
		}
	}
	public void addEdge(String a,String b){
		Node child=hm.get(a);
		Node parent=child;
			while(child!=null){
				parent=child;
				child=child.next;
			}
			hm.get(b).count+=1;
			Node n=new Node(b);
			n.count=1;
			parent.next=n;
	  }
	public void buildOrder(String []projects,String [][]a){
		 for(String s:projects){
	    	Node n=new Node(s);
	    	hm.put(s,n);
	    	
	     }
		 for(String []s:a){
			String start=s[0];
			String end=s[1];
			addEdge(start,end);
		 }
	}

	public void go(){
        while(!hm.isEmpty()){
        for(Node n:hm.values()){
            if(n.count<=0){
                sc.push(n);
                al.add(n);
             }
          }
         while(!sc.isEmpty()){
            Node n1=sc.pop();
            Node n=n1.next;
            while(n!=null){
                hm.get(n.a).count-=1;
                n=n.next;
            }
            hm.remove(n1.a);
          }
        }
    }
	public void print(){
		go();
		for(Node n:al){
			System.out.println(n.a);
		}
	}
	public void printData(){
		for(Node n:hm.values()){
			while(n!=null){
				System.out.print(n.a+"--> "+n.count+" ");
				n=n.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		projectOrder<String,String> po=new projectOrder<String,String>();
		String[] projects = {"a", "b", "c", "d", "g", "f","e"};
	    String[][] dependencies = {{"f", "c"}, {"f", "b"}, {"f", "a"}, {"a", "e"}, {"d", "g"},{"c", "a"},{"b", "a"},{"b", "e"}};
	    po.buildOrder(projects,dependencies);
	    po.print();
	}

}
