package mj.programs.java7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	   public static void main(String []argh)
	   {
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String,Integer> aMap= new HashMap<String,Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         aMap.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if(aMap.containsKey(s)){
	        	 System.out.println(s+"="+aMap.get(s));
	         }else{
	        	 System.out.println("Not found");
	         }
	        	 
	      }
	      in.close();
	   }
}

	