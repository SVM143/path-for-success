//Meta Strings (Check if two strings can become same after a swap in one string)
//Given two strings, the task is to check whether these strings are meta strings or not. Meta strings are the strings which can be made equal by exactly one swap in any of the strings. Equal string are not considered here as Meta strings.
//
//Examples:
//
//Input : str1 = "geeks" 
//        str2 = "keegs"
//Output : Yes
//By just swapping 'k' and 'g' in any of string, 
//both will become same.
//
//Input : str1 = "rsting"
//        str2 = "string
//Output : No
//
//Input :  str1 = "Converse"
//         str2 = "Conserve"
package StringPrograms.GeekForGeeks;

import java.util.HashMap;
import java.util.Scanner;

public class MetaStrings {

	HashMap<Integer, Character>hm=new HashMap<>();
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the String");
		String s1=sc.nextLine();String s3="";
		sc.close();
		int count=0;
		MetaStrings ms=new MetaStrings();
		System.out.println(ms.check(s,s1,count));
	}
	public boolean check(String s,String s1,int count){
		if(s.length()!=s1.length())
			return false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s1.charAt(i)){
				count++;
				hm.put(i,s1.charAt(i));
			}
				
		}
		if(count==2){
			for(int i=0;i<s.length();i++){
				s3
			}
		}
		else	
		return true;
	}
	

}
