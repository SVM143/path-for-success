package TreeDataStructure.java;


public class Link_Stack {
		link first; link last;
		  Link_Stack() {
			first=null;
			last=null;
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
	public void add(int a){
		link l=new link(a);
		if(empty()){
			first=l;		
		}
		else
		last.next=l;
		last=l;
 }
	public void display(){
		link current=first;
		while(current!=null){
			System.out.println(current.data);
			current =current.next;
		}
	}

	public static void main(String[] args) {
		Link_Stack ll=new Link_Stack();
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
	}

}
