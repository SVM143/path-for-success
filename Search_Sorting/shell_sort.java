package Search_Sorting;

import java.util.Scanner;

public class shell_sort {
	int a[];int count;int size;int mid;
	shell_sort(int n){
	  size=n;
	  a=new int[size];
	  count=0;
	  mid=size/2;
	}
	public boolean insert(int n){
		if(count<size){
			a[count++]=n;
			return true;
		}
		else{
			System.out.println("array full");
			return false;
		}
	}
	public void dispaly(){
		sort(a,mid);
		for(int i:a)
			System.out.println(i);
	}
	public void sort(int a[],int k){
		int n=k;		
		for(int i=0;i<size;i++){
			if(n==0)
				break;
			if(i==size-1)
				sort(a,n/2);
			if(n+i<size&&a[i]>a[i+n]){
				swap(i,i+n);
				int t=i;
				while(t-k>=0&&a[t-k]>a[i]){
					swap(t-k,i);
				}
			}
		}
			
	 }
	public void swap(int i,int n){
		int temp=a[i];
		a[i]=a[n];
		a[n]=temp;
		return;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	shell_sort st=new shell_sort(n);
	for(int i=0;i<n;i++){
	st.insert(sc.nextInt());}
	sc.close();
	st.dispaly();
	}

}
