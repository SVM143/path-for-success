package StringPrograms.GeekForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class permutation_recursion {
	HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	ArrayList<Character> al=new ArrayList<Character>();
	
	public void permute(char s[],HashMap<Character,Integer> h){
		
		
	}
	public class Node{
		Node next;int data;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public HashMap<Character,Integer> cal(char s[]){
		for(char n:s){
			if(hs.containsKey(n)){
				int no=hs.get(n)+1;
				hs.put(n,no);
				continue;
			}
			hs.put(n,1);
		}
		return hs;
	}
	//public void permuteAll(ch)
	public void display(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
	HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	String s="aabbcddd";
	permutation_recursion pr=new permutation_recursion();
	hs=pr.cal(s.toCharArray());
	pr.permute(s.toCharArray(),hs);
	for(Map.Entry<Character, Integer> m:hs.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	 }
	}

}
