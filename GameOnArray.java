package mj.programs.java7;
import java.util.*;

public class GameOnArray {
    public static boolean canWin(int leap, int[] game) {
    	int n = game.length;
    	boolean canWin= false;
    	//while(n-->0)
    	for(int i=0;i<n;){
    		if((i+1)>=n || (i+leap) >= n-1 ){
    			canWin= true;
    			break;
    		}else if(game[i+leap]==0){
    			i+=leap;
    			continue ;
    		}else if(game[i+1]==0){
    			i+=1;
    			continue ;
    		}else{
    			break;
    		}
    		   		
    	}
		return canWin;
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
