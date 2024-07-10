// 11) Create an Abstract class Processor with int member variable data and method showData to display data value.
// Create abstract method process() to define processing of member data.
// Create a class Factorial using abstract class 	Processor to calculate  and print 	factorial of a number by overriding the process method.
// Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method Ask user to enter choice (factorial 	or circle area). Also ask data to work upon; Use Processor class reference to achieve this mechanism.

import java.util.Scanner;

abstract class Processor {
    int Data;
    public void showData(){
        System.out.println("Data : "+Data);
    }

    abstract void process();

}
class Factorial extends Processor {
    Factorial(int Data){
        this.Data=Data;
    }
     public void process(){
        int factoria=1;
        for(int i=Data; i>1; i++){
        factoria*=i;
        }
        System.out.println("FActorial is : "+factoria);
    }
}
class Circle extends Processor {
    double circle;
    Circle(int DAta){
        this.Data=Data;
    }

    @Override
     public void process(){
        double pai=3.14;
        circle = pai*Data*Data;
        System.out.println("Arae of Circle is : "+circle);
    }
}
public class j11_Abstract {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for FActorial and 2 For Area of Circle : ");
        int n = sc.nextInt();

        System.out.println("Enter any Data no. : ");
        int Data = sc.nextInt();

        Processor processor;

        switch (n) {
            case 1:
                processor  = new Factorial(Data);
                break;
            case 2:
                processor = new Circle(Data);
                break;
            default:
            System.out.println("Invalid Input : ");
                break;
        }

        processor.showData();
        processor.process();


    }
}
