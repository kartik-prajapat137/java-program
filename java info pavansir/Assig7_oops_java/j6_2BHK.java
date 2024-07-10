// 6) Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
// Create default and parameterized constructor.
// Method show(): to print all data member information.
// Write main function in another class(Say XYZ) and store three TwoBHK flat’s.
// information and print information using show method. Also print total amount of all flats.


import java.util.Scanner;
class BHK1{
    private int Room_1;
    private int Hall;
    private int Rent;
    BHK1(int Room_1,int Hall){
        this.Room_1 = Room_1;
        this.Hall = Hall;
        this.Rent = Room_1+Hall;
    }
    public void Show(){
        System.out.println("Hall Area is : "+Hall);
        System.out.println("Room-1  Area is : "+Room_1);
        System.out.println("1BHK Rent is "+Rent*30+" rupees Per Month");
        System.out.println();
    }
}
class BHK2 extends BHK1{
    private int Room_2;
    private int Rent;
    BHK2(int Room_1,int Room_2,int Hall){
        super(Room_1,Hall);
       this.Room_2 = Room_2;
        Rent = Room_1+Room_2+Hall;
    }

    public void Show(){
        System.out.println();
        super.Show();
        System.out.println("Room-2 Area "+Room_2);
        System.out.println("1BHK Rent is "+Rent*30+" rupees Per Month");

    }

}
public class j6_2BHK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Rooms Area : ");
        int R1_A = sc.nextInt();
        int R2_A = sc.nextInt();
        System.out.println("Enter Hall Area: ");
        int H_A = sc.nextInt();
        BHK2 obj = new BHK2(R1_A,R2_A,H_A);
        obj.Show();
    }
}