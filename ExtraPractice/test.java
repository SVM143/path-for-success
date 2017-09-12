package ExtraPractice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class test{
  Stack<String> s=new Stack<String>();
  public void display(String s1,int j){
    String s2="";
    for(int i=0;i<=s1.length();i++){
      if(i==s1.length()){
        pop(j);
        continue;
      }
      if(s1.charAt(i)!=' ')
     s2=s2+s1.charAt(i);
      if(i+1==s1.length()){
    	  s.push(s2);
    	  continue;
      }
      if(s1.charAt(i)==' '){
        s.push(s2);
        s.push(" ");
        s2="";
      }
    }
    }
    public void pop(int j){
  // System.out.print("Case #"+j+": ");	 
      while(!s.isEmpty()){	 
        System.out.print(s.pop());
      }
    }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<String> al=new ArrayList<String>();
    test t=new test();
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=1;i<=n;i++){
    	t.display(sc.nextLine(),i);
    	System.out.println();
    }
//   for(String s:al){
//    t.display(s,i++);
//    System.out.println();
//   }
   sc.close();
  }
  }