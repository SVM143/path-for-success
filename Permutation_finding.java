package StringPrograms.GeekForGeeks;

import java.util.Scanner;

public class Permutation_finding {
	
	 void find_match(String s,int sum,int length){
		 for(int i=0;i<s.length();i++){
			 	if(i+length>s.length())
			 		break;
				 boolean t=add(s.substring(i,i+length),sum);	
				 if(t)
					 System.out.println("index : "+i);
		 }
	 }
	 boolean add(String s,int sum){
		 int k=0;
		 for(int i=0;i<s.length();i++)
			 k=k+(int)s.charAt(i);
		 if(k==sum)
			 return true;
		 else 
			 return false;
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the big String");
		int k=0;
		//char a[]=sc.nextLine().toCharArray();
		String s=sc.nextLine();
		System.out.println("Enter the String");
		char b[]=sc.nextLine().toCharArray();
		sc.close();
		Permutation_finding pf=new Permutation_finding();
		for(char i:b)
			 k=k+(int)i;
		pf.find_match(s,k,b.length);
	}

}
