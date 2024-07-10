package Assingment2;
import java.util.Scanner;
public class Program4 {
    public static void main(String args[]){ 
    Scanner s=new Scanner(System.in);
    System.out.println("Enater your marks=");
    int marks=s.nextInt();
    if(marks>80){
        System.out.println("A gread");
    }
    else if(marks<80&&marks>60){
        System.out.println("B gread");
    }
    else if(marks<60&&marks>50){
        System.out.println("C gread");
    }
    else if(marks<50&&marks>45){
        System.out.println("D gread");
    }
    else if(marks<45&&marks>25){
        System.out.println("E gread");
    }
    else {
        System.out.println("F gread");
    }
    }
}
