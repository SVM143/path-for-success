package TreeDataStructure.java;


public class Link_List {
	link first; link last;link first1;link last1;link tuck;
	  Link_List() {
		first=null;
		last=null;
		first1=null;
		last1=null;
		tuck=null;
	}
	  
public class link {
	link lt;int data;link next;
	
	link(int data){
		this.lt=null;
		this.data=data;
	}
}
public boolean empty(){
	return first==null;
}
public void fadd(int a){
	link l=new link(a);
	if(empty()){
		first=l;		
	}
	else
	last.next=l;
	last=l;
}
public void add(int a){
	link l=new link(a);
	if(empty())
		last=l;
	l.next=first;
	first=l; 
}

public void display(){
	link current=first;
	while(current!=null){
		System.out.println(current.data);
		current =current.next;
	}
}
public void display2(){
	link curren=first;
	while(curren!=null){
		System.out.println(curren.data);
		curren =curren.next;
	}
}

public void delete(int k){
	link current =first;
	link past=first;
	while(current.data!=k){
		if(current.next==null)
			break;
		else{
			past=current;
			current=current.next;
		}
	}
	if(current==first)
		first=first.next;
	else
		past.next=current.next;
	
}
public static void main(String[] args) {
		Link_List ll=new Link_List();
		ll.add(7);
		ll.add(9);
		ll.add(5);
		ll.add(10);
		ll.add(96);
		ll.add(1);
		ll.display();
		System.out.println();
		System.out.println();
		System.out.println();
		ll.delete(10);
		ll.display();
		System.out.println();
		System.out.println();
		System.out.println();
		ll.fadd(9);
		ll.fadd(8);
		ll.fadd(7);
		ll.fadd(6);
		ll.fadd(5);
		ll.fadd(4);
		//ll.display();
		System.out.println();
		System.out.println();
		System.out.println();
		ll.display2();
		ll.delete(9);
		System.out.println();
		ll.display();
		
	}

}
