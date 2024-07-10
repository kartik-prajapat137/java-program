// 5) Create class OneBHK with instance variable roomArea , hallArea and price.
//    Create default and parameterized constructor.
//    Method show(): to print OneBHK data member information.

import java.util.Scanner;

class Room{
    private int Room_l;
    private int Room_w;
    private int Hall_l;
    private int Hall_w;
    private int Room_rent;
    Room(int R_l,int R_w,int H_l,int H_w){
        Room_l = R_l;
        Room_w = R_w;
        Hall_l = H_l;
        Hall_w = H_w;
        Room_rent = (R_l*R_w+H_l*H_w)*30;
    }
    Room(){

    }
    public void Show(){
        System.out.println("Total Room Area is : "+Room_l*Room_w);
        System.out.println("Total Hall Area is : "+Hall_l*Hall_w);
        System.out.println("Room Rent is "+Room_rent+" Per Month");
    }

}
public class j5_BHK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Room length and width : ");
        int R_l = sc.nextInt();
        int R_w = sc.nextInt();
        System.out.println("Enter Room length and width : ");
        int H_l = sc.nextInt();
        int H_w = sc.nextInt();
        Room obj = new Room(R_l,R_w,H_l,H_w);
        obj.Show();
    }
}