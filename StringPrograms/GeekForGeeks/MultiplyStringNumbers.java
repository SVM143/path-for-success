//Multiply Large Numbers represented as Strings
//Given two numbers as strings. The numbers may be very large (may not fit in long long int), the task is to find sum of these two numbers.
//
//Examples:
//
//Input : num1 = 4154  
//        num2 = 51454
//Output : 213779916 
//
//Input :  num1 = 654154154151454545415415454  
//         num2 = 63516561563156316545145146514654 
//Output : 4154962260395530977724371606999799700762043993771150906291
package StringPrograms.GeekForGeeks;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
public class MultiplyStringNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no:1");
		String s=sc.nextLine();
		System.out.println("Enter the no:1");
		String s1=sc.nextLine();
		sc.close();
		String s2="";ArrayList<Integer>al=new ArrayList<>();int a=0;ArrayList<Integer>as=new ArrayList<>();
		TreeMap<Integer, String>tm=new TreeMap<>();
		for(int i=s.length()-1;i>0;i--){
			for(int j=0;j<s1.length();j++){
//				if(tm.containsKey(s2.charAt(j))&&(i!=0)){
//					s2=s2+new Vector(tm.keySet()).get(j);
//					continue;
//				}
//				else{
				    a=a+Character.getNumericValue(s.charAt(i))*Character.getNumericValue(s1.charAt(j));
					
			   // }	
		    }
			al.add(a);
			a=0;
	    }
		for(int i:al)
			System.out.println(i);
    }
}
