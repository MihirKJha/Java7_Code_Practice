package mj.programs.java7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int cnt= sc.nextInt();
    	int[]  arr = new int[cnt];
    	List<String> aList= new ArrayList<String>();
    	
    	for(int i=0;i<cnt;i++){
    		arr[i]= sc.nextInt();    		
    	}    	
    	sc.close();
    	
    	for(int l=0;l<cnt;l++){
    		 for(int i=l;i<cnt;i++){
    			StringBuilder str = new StringBuilder();
    			for(int j=l;j<=i;j++){
    				str.append(arr[j] + " ");
    			 }
    			aList.add(str.toString());
    		 }
    	}
    	
    	for(String st: aList){
    		System.out.println(st);
    	}
    
    }
}
