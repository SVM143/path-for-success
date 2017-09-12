package TreeDataStructure.java;

public class Sorted_List {

	link first; link last;link a[];int i;
	  Sorted_List() {
		first=null;
		last=null;
		a=new link[6];
		i=0;
	  }
	  
public class link {
	link lt;int data;link next;
	link(int data){
		this.lt=null;
		this.data=data;
	}
}
public void add(int n){
	link l=new link(n);
	a[i]=l;
	i++;
}
public void display(){
	for(int i=0;i<a.length;i++){
		System.out.println(a[i].data);
	}
}
public void sort(){
	//link previous=null;
	//link current=first;
	 int n = a.length;  
     for (int j = 1; j < n; j++) {  
         int key = a[j].data;  
         int i = j-1;  
         while ( (i > -1) && ( a [i].data> key ) ) {  
             a [i+1] = a [i];  
             i--;  
         }  
         a[i+1].data = key;  
     }  
}

public static void main(String[] args) {
	Sorted_List ll=new Sorted_List();
	ll.add(7);
	ll.add(9);
	ll.add(5);
	ll.add(10);
	ll.add(96);
	ll.add(1);
	ll.sort();
	ll.display();
}

}
