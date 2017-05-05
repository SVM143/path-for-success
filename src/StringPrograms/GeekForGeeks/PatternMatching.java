//Check if a string follows a^nb^n pattern or not
//Given a string str, return true string follows pattern anbn, i.e., it has a’s followed by b’s such that the number of a’s and b’s are same.
//
//Input : str = "aabb"
//Output : Yes
//
//Input : str = "abab"
//Output : No
//
//Input : str = "aabbb"
//Output : No
package StringPrograms.GeekForGeeks;

import java.util.Scanner;

public class PatternMatching {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!='a'&&i==0)
				break;
			if(s.charAt(i)=='a')
				count++;
		    if(s.charAt(i)=='b')
				count--;
		}
		if(count==0)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
