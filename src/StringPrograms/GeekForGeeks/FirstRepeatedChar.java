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
		char c='c';
		HashSet<Character>hs=new HashSet<>();
		for(int i=0;i<s.length();i++){
			 c=s.charAt(i);
			if(hs.contains(c))
				break;
			else
				hs.add(c);
		}
		
		System.out.println(c);
	}

}
