package mj.programs.java7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution5 {
	
	static boolean isAnagram(String a, String b) {
		// Complete the function
		Map<Character,Integer> hm1 = prepareCharMap(a.toUpperCase().toCharArray());	
		Map<Character,Integer> hm2 = prepareCharMap(b.toUpperCase().toCharArray());	
		return hm1.equals(hm2);
    }
	
	public static HashMap<Character,Integer> prepareCharMap(char[] charArr){
		int cnt=1; 
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<charArr.length ;i++){
			cnt=1;
			if(!hm.containsKey(charArr[i])){
				for(int j=i+1;j<charArr.length;j++){
					if(charArr[i]==charArr[j]){
						cnt++; 
					}	
				}
				hm.put(charArr[i], cnt);	
			}

		}		
		return hm;		
	}

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


