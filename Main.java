package mj.programs.java7;
import java.util.*;
public class Main{
   
   static Iterator func(List mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         if(element instanceof String)//Hints: use instanceof operator
            break;
      }
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      List mylist = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}
