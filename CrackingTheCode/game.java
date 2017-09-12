package CrackingTheCode;

import java.util.ArrayList;
import java.util.Scanner;

public class game {
	
	public int playGame(ArrayList<Integer> a,ArrayList<Integer> b){
		int totalScore=0;
		for(int i=1;i<=b.size();i++){
			int score=selectInterval(b.get(i),a);
			if(i%2==1){
				totalScore+=score;
			}
			else
				totalScore-=score;
		}
		return totalScore;
	}
	
	public int  selectInterval(int i,ArrayList<Integer> a){
		for(int j=1;j<i;j++)
		return 1;
	}
	
	public static void main (String args[]){
		game g=new game();
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<Integer>l=new ArrayList<>();
		ArrayList<Integer>k=new ArrayList<>();
		ArrayList<Integer>results=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int t=0;t<testcase;t++){
			
		for(int i=1;i<=2;i++){
			al.add(sc.nextInt());
		}
		for(int i=1;i<al.get(0);i++){
			l.add(sc.nextInt());
		}
		for(int i=1;i<al.get(1);i++){
			k.add(sc.nextInt());
		}
		results.add(g.playGame(l,k));	
	   }
		sc.close();
	}
	
}
