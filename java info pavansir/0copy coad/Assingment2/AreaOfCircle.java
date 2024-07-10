package Assingment2;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius of circle=");
        float radius=s.nextFloat();
        float pi=3.14f,area;
        area=pi*radius*radius;
        System.out.println("area of circle="+area);
    }
}
