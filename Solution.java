package mj.programs.java7;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Builder;
import java.util.Scanner;


public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale aLocale = new Builder().setLanguage("en").setScript("Latn").setRegion("IN").build();
        String us= NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india= NumberFormat.getCurrencyInstance(aLocale).format(payment);
        String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
