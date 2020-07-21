package mj.programs.java7;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
       
      //Write your code here
        HashSet<String> stObj = new HashSet<String> ();
        int cnt =0 ;
           for (int i = 0; i < t; i++) {
               if(!stObj.contains(pair_left[i]) && !stObj.contains(pair_right[i])){
            	   cnt++;
            	   stObj.add(pair_left[i]);
            	   stObj.add(pair_right[i]);
            	}
               System.out.println(cnt);
            } 

        s.close();
    }
} 
	