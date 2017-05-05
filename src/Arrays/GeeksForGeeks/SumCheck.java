package Arrays.GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class SumCheck {

	public static void main(String[] args) {
		System.out.println("Length Of The String");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		System.out.println("Enter the array numbers");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		sc.close();
		int l=new SumCheck().check(a,sum);
		System.out.println(l);
		if(l==0)
			System.out.println("no pairs found");
		else
			System.out.println("the pair are:"+(sum-l)+","+(sum-(sum-l)));
	}
	public int check(int a[],int sum){
		Arrays.sort(a);
		return SumNO(a,0,a.length-1,sum);
	}
	public int SumNO(int a[],int l,int r,int sum){
		while(l<r){
			if(a[l]+a[r]==sum)
				return a[l];
			else if(a[l]+a[r]>sum)
				r--;
			else
				l++;
		}
		return 0;
	}

}
