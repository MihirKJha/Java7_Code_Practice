package mj.programs.java7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         *  Your class should be named Solution. */
    	Scanner sc= new Scanner(System.in);
    	int cntOfN= sc.nextInt();
    	List<Integer []> arrList = new ArrayList<Integer []>();
    	arrList.add(new Integer[0]);
    	for(int i=0;i< cntOfN;i++){
    		 int cnt= sc.nextInt();
    		 Integer[] arr = new Integer[cnt];
    		 for(int j=0;j<cnt;j++){
    			 arr[j]=sc.nextInt();
    		 }
    		 arrList.add(arr);
    	}
    	int numberOfQues=sc.nextInt();
    	for(int i=0;i<numberOfQues;i++){
    		int x = sc.nextInt();
    		int y= sc.nextInt();
    		try{
    		  System.out.println((arrList.get(x))[y-1]);
    		 }catch(Exception ex){
    		   System.out.println("ERROR!");	 
    		 }
    		
    	}
    	sc.close();
    }
}

	