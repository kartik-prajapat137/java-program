// 19) Make list of Students having name, roll no., age, score. 
// Write a program to accept 10 students record and arrange the Students based on the
//  score group [0-50], [50-65],[65-80],[80-100].

import java.util.Scanner;

class Student{
    Scanner sc = new Scanner(System.in);
    private String[] Sname;
    private int[] Smarks;
    Student(int n){
        Sname = new String[n];
        Smarks = new int[n];
    }
   public void Std_name_marks(){
    for (int i=0; i<Smarks.length; i++) {
        System.out.print(i+1+"Enter Student Name : ");
        Sname[i] = sc.next();
        System.out.print(i+1+"Enter Student Marks : ");
        Smarks[i] = sc.nextInt();
    }
   }
   public void Arrange(){
    for (int i=0; i<Smarks.length-1; i++){
        for (int j =i+1; j < Smarks.length; j++) {
        if(Smarks[i]>Smarks[j]){
             int temp = Smarks[i];
             Smarks[i]=Smarks[j];
             Smarks[j]=temp;
             String temp2 = Sname[i];
             Sname[i]=Sname[j];
             Sname[j]=temp2;
        }
    }
   }
}

public void Display(){
    System.out.println();
    for (int i=0; i< Smarks.length; i++) {
        System.out.println(i+1+"\t"+Sname[i]+"\t"+Smarks[i]);
    }
}
}
public class j19_Student {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Number Of Students : ");
        int n = sc2.nextInt();
        Student obj = new Student(n);
        obj.Std_name_marks();
        obj.Arrange();
        obj.Display();
    }  
}
