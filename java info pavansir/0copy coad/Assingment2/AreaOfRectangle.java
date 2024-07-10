package Assingment2;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter lenght of rectangle=");
        int lenght=s.nextInt();
        System.out.println("Enter width of rectangle=");
        int width=s.nextInt();
        int area;
        area=lenght*width;
        System.out.println("area of rectangle="+area);
    }
}
