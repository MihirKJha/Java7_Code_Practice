package mj.programs.java7;
import java.util.Scanner;

public class SubArraySumNegativeCheck {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. 
         * Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int cnt= sc.nextInt();
    	int numberOfNegativeCnt=0;int sum=0;
    	int[]  arr = new int[cnt];
    	for(int i=0;i<cnt;i++){
    		arr[i]= sc.nextInt();    		
    	}    	
    	sc.close();
    	for(int l=0;l<cnt;l++){
    		 for(int i=l;i<cnt;i++){
    			sum=0;
    			for(int j=l;j<=i;j++){
    				sum+=arr[j];
    			}
    			if(sum<0)
    				numberOfNegativeCnt++; 
    		 }
    	}
    	System.out.println(numberOfNegativeCnt);
    
    }
}
