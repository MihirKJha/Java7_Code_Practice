package mj.programs.java7;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        String C= A.substring(0, 1).toUpperCase() + A.substring(1,A.length());
        String D = B.substring(0, 1).toUpperCase() + B.substring(1,B.length());
        System.out.println(C +" "+D);	
    }
}

