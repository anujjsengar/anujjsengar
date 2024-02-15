package Recurssion;
import java.util.*;
public class andrew {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int winscore=0;
        int score;
        String Win="";
        String name;
        while(n>0){
            name=sc.nextLine();
            score=sc.nextInt();
            if(score>winscore){
                winscore=score;
                Win=name;
            }
            n--;
        }
        System.out.println(Win);
	}
}
