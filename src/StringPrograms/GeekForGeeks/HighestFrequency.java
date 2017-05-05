package StringPrograms.GeekForGeeks;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class HighestFrequency {

	public static void main(String[] args) {
		TreeSet<String>hs=new TreeSet<>();
		String s1="";
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();sc.close();int j=0;
		for(int i=0;i<s.length();i++){
			for(j=0;j<s.length();j++){
				for(int k=i;k<=j;k++){
					s1=s1+s.charAt(k);
				}
				hs.add(s1);
				s1="";
			}
		}
		int count=0;int l=0;int c=0;
		for (String s3 : hs) {
			Pattern p=Pattern.compile(s3);
			Matcher m=p.matcher(s);
			while(m.find()){
				count++;
			}
			l=count*s3.length();
			if(l>c)
				c=l;
			count=0;
			l=0;
		}
		System.out.println(c);
	}

}
