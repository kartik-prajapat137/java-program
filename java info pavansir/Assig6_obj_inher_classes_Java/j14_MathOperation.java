
// Q.14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R

import java.util.Scanner;

class Test{
    Scanner sc = new Scanner(System.in);
    private int x;
    private int y;
    private int R;
    public void init(){
        System.out.print("Enter First Value : ");
        int x =sc.nextInt();
        System.out.print("Enter Second Value : ");
        int y =sc.nextInt();

        this.x=x;
        this.y=y;
    }

    public int add(){
        R=x+y;
        return R;
    }

    public int mul(){
         R=x*y;
         return R;
    }

    public int power(){
         R=1;
        for (int i=1; i<=y; i++) {
            R*=x;
        }
        return  R;
    }

    public void Display(){
        System.out.println("Add : "+add());
        System.out.println("MUl : "+mul());
        System.out.println("Power : "+power());
    }
}
public class j14_MathOperation {
    public static void main(String[] args) {
        Test test = new Test();
        test.init();
        test.Display();
    }
}
