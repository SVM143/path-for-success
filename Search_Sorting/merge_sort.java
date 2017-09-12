package Search_Sorting;

public class merge_sort {
	
	public void sort(int a[],int start,int end){
		int n=a.length;
		int mid=(start+end)/2;
		part(a,start,mid);
		part(a,mid+1,end);
		
	}
	public void part(int a[],int start,int end){
		if(start!=end){
			int mid=(start+end)/2;
			part(a,start,mid);
			part(a,mid+1,end);
		}
	}
}
