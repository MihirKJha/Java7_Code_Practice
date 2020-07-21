package mj.programs.java7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourglassMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        List<Integer> arrLst= new ArrayList<Integer>();
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
       in.close();
        for(int i=0;i<4;i++){
        	for(int j=0;j<4;j++){
        		 arrLst.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+
        				arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
        	}
        }
        Collections.sort(arrLst);
        System.out.println(arrLst.get(arrLst.size()-1));
        }
}
