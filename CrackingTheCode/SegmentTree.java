package CrackingTheCode;

public class SegmentTree {
		int seg[];int a[];
	public void initialise(int a[]){
		this.a=a;
		int cal=(int)Math.ceil(Math.log(a.length)/Math.log(2));
	    seg=new int[(int)Math.pow(2, cal+1)-1];
		SegmentArrayConstruct(a,seg,0,a.length-1,0);
	}
	public int find(int low,int high,int c[]){
		initialise(c);
		return findQuery(seg, low, high, 0, a.length-1, 0);
	}
	public void SegmentArrayConstruct(int a[],int seg[],int start,int end,int pos){
		if(start==end){
			seg[pos]=a[start];
			return;
		}
		int mid=(start+end)/2;
		SegmentArrayConstruct(a,seg,start,mid,pos*2+1);
		SegmentArrayConstruct(a,seg,mid+1,end,pos*2+2);
		seg[pos]=seg[2*pos+1]<seg[2*pos+2]?seg[2*pos+1]:seg[2*pos+2];
	}
	public void print(){
		for(int i:seg)
			System.out.print(i+" ");
	}
	
	public int findQuery(int seg[],int low,int high,int start,int end,int pos){
		if(low<=start&&high>=end)
			return seg[pos];
		if(low>end||high<start)
			return Integer.MAX_VALUE;
		int mid=(start+end)/2;
		return minValue(findQuery(seg,low,high,start,mid,pos*2+1),findQuery(seg,low,high,mid+1,end,pos*2+2));
			
	}
	public int minValue(int a,int b){
		return a<b?a: b;
	}
	public static void main(String[] args) {
		int a[]={-1,2,4,0};	
		SegmentTree st=new SegmentTree();
		System.out.println("1 and 3 is "+st.find(1,3,a));
		for(int i:a)
			System.out.print(i+" ");
		//st.print();
	}

}
