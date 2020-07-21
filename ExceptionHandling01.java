package mj.programs.java7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling01 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. 
		 * Print output to STDOUT. Your class should be named Solution. */
		Scanner sc= new Scanner(System.in);
		
        try{
        	int x= sc.nextInt();
    		int y = sc.nextInt();
    		sc.close();
          System.out.println(x/y); 	
        }catch (InputMismatchException iMe){
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException aE){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
	}
}
