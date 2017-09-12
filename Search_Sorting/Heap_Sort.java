package Search_Sorting;

public class Heap_Sort {
	public void sort(int a[],int n){
		
		for(int i=n / 2- 1;i>=0;i--)
			
			max_heapify(a,n,i);
			
			for(int j=n-1;j>=0;j--){
				
				 int temp = a[0];
		            a[0] = a[j];
		            a[j] = temp;
		        max_heapify(a,j,0);
			}
		
	}
	public void max_heapify(int a[],int n,int i){
		int max=i;	
		int lc=2*i+1;
		int rc=2*i+2;
		if(lc<n&&a[lc]>a[max])
			max=lc;
		if(rc<n&&a[rc]>a[max])
			max=rc;
		if(max!=i){
			int temp=a[i];
			a[i]=a[max];
			a[max]=temp;
			max_heapify(a,n,max);
		}
		
	}
	public void print(int a[]){
		for(int i:a)
			System.out.println(i);
	}

}
