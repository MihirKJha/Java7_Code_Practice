package mj.programs.java7;

public class ThreeNumberCompare {
	
	public static void main(String args[]){
		
		int a = 5;
		int b = 8;
		int c=-4;
		int tmp =0 ;
			
		if(a> b){
			tmp =a;
		}else{
			tmp =b;
		}
		if(tmp>c){
			System.out.println("Greatest number is " + tmp); 
		} else{
			System.out.println("Greatest number is " + c); 
		}
		
		
	}

}
