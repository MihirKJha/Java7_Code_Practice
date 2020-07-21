package mj.programs.java7;
import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
         String[]  p= s.trim().split("[\\s!,?._'@]+");
        int cnt =0;
        for(String str: p ){
            if(!str.trim().isEmpty()) cnt++;
        }
        System.out.println(cnt);
        for(String str: p ){
        	 if(!str.trim().isEmpty())System.out.println(str);
        }
        scan.close();
    }
}
