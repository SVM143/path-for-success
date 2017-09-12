package Search_Sorting;

public class quick_sort {
//	int a[];int size;
	quick_sort(){
//		a=b;
//		size=a.length;
//		sort(a,0,size-1);
//		for(int i:a)
//			System.out.println(i);
	}
	
	public void sort(int a[],int start,int end){
		if(start<end){
		int index=partition(a,start,end);
		sort(a,start,index-1);
		sort(a,index+1,end);
		}
	 }
	public int partition(int a[],int start,int end){
		int pivot=a[end];
		int p=start-1;
		for(int i=start;i<=end-1;i++){
			if(a[i]<=pivot){
				p++;
				swap(a,p,i);	
			}
		}
		swap(a,p+1,end);
		return p+1;
	}
	public void swap(int a[],int p,int i){
		int temp;
		temp=a[p];
		a[p]=a[i];
		a[i]=temp;
		return;
	}
	public void dispaly(int a[]){
		for(int i:a)
			System.out.println(i);
	}
}
