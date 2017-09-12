package CrackingTheCode;

import java.util.Scanner;

public class SubStringCount {

	public int[] count(char s[],char sub[]){
		int c[]=new int[sub.length];
		 int k=0;
		for(int i=1,j=0;i<sub.length;i++){
			if(sub[i]==sub[j]){
				k=1;
				c[i]=++j;
				continue;
			}
			if(k==0){
				c[i]=j;
				continue;
			}
			while(j>0){
			j=j-1;
			int p=c[j];
			if(sub[i]==sub[p]){
				c[i]=p+1;
				break;
			}
		  }
		}
		return c;
	}
	public int count(char s[],char sub[],int c[]){
		int count=0;int j=0;int k=0;
		for(int i=0;i<s.length;i++){
		if(j+1>=sub.length){
			count++;
			j=j-1;k=0;
		}
		if(sub[j]==s[i]){
			k=1;
			j++;
			continue;
		  }
		if(k!=0&&j>0)
		{
			j=c[j-1];
			if(sub[j]==s[i])
				j++;
		  }
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		
	SubStringCount s=new SubStringCount();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1=sc.nextLine();
	System.out.println("Enter the subString");
	String s2=sc.nextLine();
	sc.close();
	int c[]=s.count(s1.toCharArray(),s2.toCharArray());
	for(int i:c)
		System.out.println(i+" ");
	System.out.println(s.count(s1.toCharArray(),s2.toCharArray(),c));
	}

}
