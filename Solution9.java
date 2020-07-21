package mj.programs.java7;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc= new Scanner(System.in);
       BigInteger b1; BigInteger b2;
       b1= sc.nextBigInteger();
       b2= sc.nextBigInteger();
       sc.close();
       System.out.println(b1.add(b2));
       System.out.println(b1.multiply(b2));
       
    }
}
