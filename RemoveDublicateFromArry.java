package mj.programs.java7;

public class RemoveDublicateFromArry {
	
	public static boolean checkArray(int b[],int c){
		boolean isPresent =false;
		for(int i=0;i<b.length;i++){
			if(b[i]==c){
				isPresent = true ;
				break;
			}			
		}
		return isPresent;
		
	}

	public static void main(String[] args) {
		int a[] ={1,0,15,15,2,2,3,4,4,15};
		int b[]= new int[a.length];
		int count;int k=0;

		for(int i=0;i<a.length;i++){
			count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}

			if(count==1 && !checkArray(b,a[i])){
				b[k]=a[i];
				k++;
			}else if (count>1 && !checkArray(b,a[i])){
				b[k]=a[i];
				k++;
			}
		}
		int c[]= new int[k];
		for(int i=0;i<c.length;i++){
			c[i]=b[i];
		}

		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
	}
}
