package mj.programs.java7;

public class ArrayArrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]  arr = {3,-4,9,7,0,12,-4,-7};
       int tmp1=0,tmp2=0,tmp3=0;
       for(int i=0; i<arr.length;i++){
    	   tmp1=arr[i];
    	       if(tmp1>=arr[i]){
    	    	   tmp1=arr[1];
    	       }
       }
	}

}
