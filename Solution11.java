package mj.programs.java7;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
class Solution11 {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
      
      	//Write your code here
    	BigDecimal [] bd  = new BigDecimal[n];
      	for(int i=0;i<n;i++){
      		bd[i] = new BigDecimal(s[i],MathContext.UNLIMITED);
      	}
      	BigDecimal temp ;
      	//Write your code here
      	for(int i=0;i<n;i++){
      		for(int j=i+1;j<n;j++){
      			if (bd[i].compareTo(bd[j]) <0 ){
      				temp = bd[j];
      				bd[j]=bd[i];
      				bd[i]=temp;
      			}
      		}
      	}
      	for(int i=0;i<n;i++){
      		s[i] = bd[i].toPlainString();
      	}
      //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
