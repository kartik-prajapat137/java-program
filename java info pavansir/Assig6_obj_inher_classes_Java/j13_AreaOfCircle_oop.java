// 13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
// init - to input radius from user
// calc - to calculate area
// display- to display area

import java.util.Scanner;

class AreaOC{
    private float area;

   public void calculate(int x){
        area=(3.14f)*x;
    }
    public float  DisplayArea(){
        return area;
    }

}
public class j13_AreaOfCircle_oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle to find Area of Circle : ");
        int n = sc.nextInt();
        AreaOC aoc = new AreaOC();
        aoc.calculate(n*n);
       System.out.println("Area of Circle is : "+ aoc.DisplayArea());


    }
}
