package CrackingTheCode;

import java.util.Arrays;

public class LazyPropagation {
	int seg[];int duplicate[];
	public void initializeSegmentTree(int a[]){
		int cal=(int)Math.ceil(Math.log(a.length)/Math.log(2));
		int height=(int)Math.pow(2,cal+1)-1;
		seg=new int[height];
		duplicate=new int[height];
		Arrays.fill(duplicate, 0);
		ConstructTree(a,seg,0,a.length-1,0);
		findQuery(seg,1, 3, 0, a.length-1,0);
	}
	public void ConstructTree(int a[],int seg[],int start,int end,int pos){
		if(start==end){
			seg[pos]=a[start];
			return;
		}
		int mid=(start+end)/2;
		ConstructTree(a, seg, start, mid, pos*2+1);
		ConstructTree(a, seg, mid+1, end, pos*2+2);
		seg[pos]=seg[pos*2+1]<seg[pos*2+2]?seg[pos*2+1]:seg[pos*2+2];
	}
	public int findQuery(int seg[],int clow,int chigh,int start,int end,int pos){
		if(clow<=start&&chigh>=end)
			return seg[pos];
		if(clow>end||chigh<start)
			return Integer.MAX_VALUE;
		int mid=(start+end)/2;
		return minValue(findQuery(seg,clow,chigh,start,mid,pos*2+1),findQuery(seg,clow,chigh,mid+1,end,pos*2+2));
	}
	
	public int minValue(int a,int b){
		return a<b?a: b;
	}
	public void print(){
		for(int i:seg)
			System.out.println(i);
	}
	public static void main(String[] args) {
	int a[]={-1,2,4,0};
	LazyPropagation lp=new LazyPropagation();
	lp.initializeSegmentTree(a);
	}

}
