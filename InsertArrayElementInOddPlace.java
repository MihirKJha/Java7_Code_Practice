/**
 * 
 */
package mj.programs.java7;

/**
 * @author Mihir Kumar Jha
 *
 */
public class InsertArrayElementInOddPlace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[7];
		
		for(int i=0 ; i< arr.length; i++ ){
			if(i%2!=0){
			 arr[i]=3;
			}else{
				arr[i]=2;	
			}
		}
        
		for(int j :arr ){
			System.out.println(arr[j]);
		}
        
	}

}
