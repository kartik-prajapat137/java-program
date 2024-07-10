// 16) Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.

import java.util.Scanner;

class Test{
    Scanner sc = new Scanner(System.in);
    private int age;
    private String Name;
    Test(){
        System.out.print("Enter Age : ");
        this.age = sc.nextInt();
        if(age<=0)
        this.age=18;
        System.out.print("Enter Name : ");
        this.Name = sc.next();
    }
    public void Display(){
        System.out.println("Name is : "+Name);
        System.out.println("Age is : "+age);
    }
}

public class j16_name_age {
    public static void main(String[] args) {
        Test test = new Test();
        test.Display();
    }
}
