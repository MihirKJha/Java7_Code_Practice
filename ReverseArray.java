package mj.programs.java7;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={1,2,3,4,10,20,45,63};
		int b[]= new int[a.length];int cnt=0;
		//System.out.println("length" + a.length);
		System.out.println("Arrays before reversal");
		for(int i: a){
			System.out.print( i +" ");
		}
		System.out.println(" ");
		
		for(int i=a.length-1;i>=0;i--){
		    b[cnt++]= a[i];
		}
		
		
		System.out.println("Arrays after reversal");
		for(int i: b){
			System.out.print( i +" ");
		}

	}

}
