// 8) Create a class Student with two members : rollno and percentage.
	// Create default and parameterized constructors. Create method show() to 	display information.
	// Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default and parameterized constructors. Also override show() method.
	// Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized 	constructors. Also override show() method.
	// Create a class(say XYZ) with main method that carries out the operation of the project :
// has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
// create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
// display all record from the array.
// search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
// count how many students are having A grade,if for A grade percentage >75.

import java.util.Scanner;

class Student1{
    int rollno;
    double percentage;
    Student1(){
        this.rollno=0;
        this.percentage=0;
    }
    Student1(int rollno, double percentage){
        this.rollno=rollno;
        this.percentage=percentage;
    }
    public void Display(){
        System.out.println("Roll no. : ");
        System.out.println("percentage : ");
    }
}
class CollageStudent1 extends Student1 {
    private int semester;
    CollageStudent1(){
        super(0,0);
        this.semester=semester;
    }
    CollageStudent1(int rollno, double percentage, int semester){
        super(rollno,percentage);
        this.semester=semester;
    }
    @Override
    public void Display() {
        super.Display();
        System.out.println("Semester is : ");
    }
}
class SchoolStudent1 extends Student1 {
    private String cllass;
    SchoolStudent1(){
        super(0,0);
        this.cllass=cllass;
    }
    SchoolStudent1(int rollno,double percentage, String cllass){
        super(rollno,percentage);
        this.cllass=cllass;
    }
    @Override
    public void Display() {
        // TODO Auto-generated method stub
        super.Display();
        System.out.println("Class : "+cllass);
    }

}
public class j8_Student {
    public static void main(String[] args) {
        Student[] stdArr = new Student[5];
        stdArr[0] = new CollegeStudent(1,80,6);
        stdArr[1] = new CollegeStudent(2,70,6);
        stdArr[2] = new CollegeStudent(3,65,6);
        stdArr[3] = new SchoolStudent(4,97,"12th");
        stdArr[4] = new SchoolStudent(5,95,"10th");


        System.out.println("All Students Data : \n");
        for(Student std : stdArr){
            std.show();
            System.out.println();
        }

        System.out.print("Enter Roll no for Print Data :  ");
        Scanner sc = new Scanner(System.in);
        int sreachRollNo = sc.nextInt();
        int count =0;
        for(Student std : stdArr){
            if(std.percentage>75){
                count++;
            }
           if(std.rollno==sreachRollNo){
                std.show();
           }
        }
        System.out.println("\nTotal Student Above 75 is : "+count);
        
    }
}
