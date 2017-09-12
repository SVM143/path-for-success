package Search_Sorting;

public class BinarySearch {
	public boolean Find(int a[],int key){
		int lowBound=0;
		int highBound=a.length-1;
		int curIn;
		while(true){
			curIn=(lowBound+highBound)/2;
			if(a[curIn]==key)
				return true;
			else if(lowBound > highBound)
				return false;
			else{
				if(a[curIn]<key)
					lowBound=curIn+1;
				else
					highBound=curIn-1;
			}
			return true;
		}
	}
}
