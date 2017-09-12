package StringPrograms.GeekForGeeks;
import java.util.*; 
public class Isomorphic_String {
	TreeMap<Character,Character> tm=new TreeMap<Character,Character>();
	
	public boolean Ismor(String s,String t){
		
		String s1="";
		
		//if the length is not equal then return false
		if(s.length()!=t.length())
			return false;
		
		//using tree Map to store one charater's mirror character
		for(int i=0;i<s.length();i++)
			tm.put(s.charAt(i),t.charAt(i));
		
		//iteration of tree Map
		 for(Map.Entry m:tm.entrySet()){
			 
			 // replace the character 
			   s1=s.replace((char)m.getKey(),(char)m.getValue());
			   s=s1;
			}
		 
		 if(s1.equals(t))
			 return true;
		 else
			 return false;
	}
	public static void main(String[] args) {
		
	System.out.println(new Isomorphic_String().Ismor("aab", "xxy"));
	}

}
