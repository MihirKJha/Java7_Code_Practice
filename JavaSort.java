package mj.programs.java7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
public class JavaSort {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      in.close();
       Collections.sort(studentList, new Comparator<Student>(){
           public int compare(Student e1, Student e2) {
                if(e2.getCgpa()!=(e1.getCgpa())){
                   return e2.getCgpa() > e1.getCgpa()? 1:-1;
                }else if(e1.getFname().compareTo(e2.getFname())!=0){
                    return e1.getFname().compareTo(e2.getFname());
                }else {
                	return e2.getId() > e1.getId()? 1:-1; 
                }
            }
       });
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
	