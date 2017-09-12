package ExtraPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class fibgcd {
		
	public int fibo(int n){
	   
	    int f[] = new int[n+1];
	    int i;
	    f[0] = 0;
	    f[1] = 1;
	     
	    for (i = 2; i <= n; i++)
	    {
	        f[i] = f[i-1] + f[i-2];
	    }  
	    return f[n];
	    }
	public int gcd(int n1,int n2){
		 int r;
         
         while(n2 != 0)
         {
             r = n1 % n2;
             n1 = n2;
             n2 = r;
         }
         return n1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);ArrayList<Integer>al=new ArrayList<Integer>();
		fibgcd fb=new fibgcd();
		int size=sc.nextInt();int k=0;
		int query=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	for(int i=0;i<query;i++){
		
			int p=sc.nextInt();
			int q=sc.nextInt();
			for(int j=p-1;j<q;j++){
				 al.add(fb.fibo(a[j]));
			}
			k=al.get(0);
			
			for(int j=0;j<al.size()-1;j++){
				
				k=fb.gcd(k,al.get(j+1));
			}
			al.clear();
			System.out.println(k);
		}
		sc.close();
	}

}
