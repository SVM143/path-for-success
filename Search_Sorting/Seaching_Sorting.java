package Search_Sorting;

import java.util.Scanner;

public class Seaching_Sorting {

	public static void main(String[] args) {
		System.out.println("Enter The no of Numbers");
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
//		for(int i:a)
//			System.out.println(i);
		System.out.println("1: Binary Search");
		System.out.println("2: Radix Sort");
		System.out.println("3: Quick Sort");
		System.out.println("4: heap sort");
		switch(sc.nextInt()){
		case 1:
			 System.out.println("Enter the to be found");
			 int n=sc.nextInt();
			 break;
		case 2:
			radix_sort rs=new radix_sort(a);
//			rs.sort();
//			rs.display();
			break;
		case 3:
			quick_sort qs=new quick_sort();
			qs.sort(a,0,a.length-1);
			qs.dispaly(a);
			break;
		case 4:
			Heap_Sort hs=new Heap_Sort();
			hs.sort(a,a.length);
			hs.print(a);
		}
	}

}
