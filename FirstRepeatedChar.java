//Find the first repeated character in a string
//Input:  ch = "geeksforgeeks"
//Output: e 
//e is the first element that repeats
//
//Input:  str = "hello geeks"
//Output: l 
//l is the first element that repeats
package StringPrograms.GeekForGeeks;

import java.util.HashSet;
import java.util.Scanner;
public class FirstRepeatedChar {

	public static void main(String[] args) {
		System.out.println("Enter The string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		char c='\n';int i;
		HashSet<Character>hs=new HashSet<>();
		for(i=0;i<s.length();i++){
			 c=s.charAt(i);
			if(hs.contains(c))
				break;
			else
				hs.add(c);
		}
		if(s.length()==i)
			System.out.println("not ");
		else
		System.out.println(c);
	}

}
