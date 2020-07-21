package mj.programs.java7;
import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrom= false; 
        for(int i=0;i<A.length()/2;i++){
        	isPalindrom= false; 
        	char tmpCh= A.charAt(i);
        	char lasCh= A.charAt(A.length()-1-i);
        	if(tmpCh!=lasCh){
        		System.out.println("No"); 
        		break;
        	}else{
        		isPalindrom =true ; 
        	}
        }
         if(A.length()==1 || isPalindrom){
        	 System.out.println("Yes");  
         }
    }
}

