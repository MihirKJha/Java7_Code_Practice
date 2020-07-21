package mj.programs.java7;
import java.util.Scanner;
import java.util.regex.*;

public class Solution8
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
         try{
        	 Pattern p= Pattern.compile(pattern);
        	 System.out.println("Valid");
         }catch(PatternSyntaxException pse){
        	 System.out.println("Invalid"); 
         }
         testCases--;          
      }
   }
}