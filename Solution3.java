package mj.programs.java7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution3 {

	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        List<String> aList= new ArrayList<String>();
	        String pat= "([a-zA-Z])"+"{" + k+"}";
	        Matcher m = Pattern.compile(pat).matcher(s);
	        for (int i = 0; m.find(i); i = m.start() + 1) {
	        	aList.add(m.group());
	        	//System.out.print(m.group() + " ");	            
	        }
	        Collections.sort(aList);
	        smallest=aList.get(0);
	        largest=aList.get(aList.size()-1);
	        //System.out.println("smallest " + smallest);	
	        //System.out.println("largest " +largest);	
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
}

