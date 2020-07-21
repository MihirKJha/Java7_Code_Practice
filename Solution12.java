package mj.programs.java7;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Solution12 {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
       String[] str = new String[n];
       for(int i=0;i<n;i++){
           str[i]=s[i];
       }
       
      	Arrays.sort(str, new Comparator<String>() {
      		@Override
      		public int compare(String a1, String a2){
      			BigDecimal a = new BigDecimal(a1);
      			BigDecimal b = new BigDecimal(a2);
      			return b.compareTo(a);
      			
      			
      		}
		});
      	for(int i=0;i<n;i++){
            s[i]=str[i];
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
