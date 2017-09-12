//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures?
//Hints: #44, # 777, # 7 32
package StringPrograms.GeekForGeeks;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Hash_String {
	ArrayList<Character> al=new ArrayList<Character>();
	TreeMap<Integer, ArrayList<Character>> tm=new TreeMap<Integer,ArrayList<Character>>();
	public boolean check(char a[]){
		int j=0;
		for(int i=0;i<a.length;i++){
			j=(int)a[i]%10;
			if(tm.containsKey(j)){
				//return false;
				tm.get(j).add(a[i]);
			}
			else{
				ArrayList<Character> at=new ArrayList<Character>();
				at.add(a[i]);
				tm.put(j,at);
			}
		}
		print(tm);
		return true;
	}
	public void print(TreeMap<Integer, ArrayList<Character>> tm){
		for(Map.Entry<Integer, ArrayList<Character>> entry:tm.entrySet()){
			ArrayList<Character> list = entry.getValue();
            
            for(Character c:list){
                System.out.print(c + " ");
            }
            System.out.println();
		}
	}
	public static void main(String[] args) {
		String s="sourabAS";
		char c[]=s.toCharArray();
		Hash_String hs=new Hash_String();
		if(hs.check(c))
			System.out.println("its Unique");
		else
			System.out.println("Not unique");
	}

}
