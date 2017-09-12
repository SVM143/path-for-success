/*Given a string, write a recursive function that check if the given string is palindrome, else not palindrome.*/
//Input : malayalam
//Output : Yes
//Reverse of malayalam is also
//malayalam.
//
//Input : max
//Output : No
//Reverse of max is not max.
package StringPrograms.GeekForGeeks;

import java.util.Scanner;

public class RecursivePallindrome {
	int k=0;String a[];int l;

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	String a[]=new String[s.length()];
	a=s.split("");
	RecursivePallindrome Rp=new RecursivePallindrome(a);
	System.out.println(Rp.check(a));
	sc.close();
	}
	RecursivePallindrome(String a[]){
		this.a=a;
		l=a.length-1;
	}
	public boolean check(String a[]){
	if(l==0)//if 1 char is there
		return true;
	else 
		 return AtCheck(a,k,l);
	}
	public boolean AtCheck(String a[],int k,int l){
		if(k<l+1){// for middle element
		if(a[k]==a[l])
			return AtCheck(a,k+1,l-1);
		else
			return false;
	}
		return true;
  }		
}
