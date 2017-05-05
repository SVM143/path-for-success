package StringPrograms.GeekForGeeks;

import java.util.Scanner;
import java.util.TreeSet;

public class ConcatSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		System.out.println("Enter the no");
		int k=sc.nextInt();
		sc.close();
		TreeSet <String>hm=new TreeSet<>();
		for(int i=0;i<s1.length();i++){
			for(int j=i+1;j<=s1.length();j++){
				hm.add(s1.substring(i,j));
			}
		}
		String s3="";
		for(String s2:hm)
			s3=s3+s2;
		String a[]=new String[s3.length()];
		a=s3.split("");	
		System.out.println(a[k-1]);
	 }  
	}

