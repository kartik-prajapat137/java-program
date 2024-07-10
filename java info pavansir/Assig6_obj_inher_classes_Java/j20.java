// 20)Create class Tile to store the edge length of a square tile , and create another class 
// Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor
// class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.

import java.util.Scanner;

class Tile{
    private int t;
    void setTile(int t){
        this.t=t;
    }
    int getTile(){
        t=t*t;
        return t;
    }
}
class Floar extends Tile{
    private int l;
    private int w;
    private int T_Area;
    private float Require_T;

    Floar(int t,int l,int w){

        setTile(t);
        this.l=l;
        this.w=w;
    }
    void floar(){
        T_Area = l*w;
    }
    float Total_T(){
        Require_T = T_Area/getTile();
        return Require_T;
    }
}
public class j20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Tile : ");
        int t = sc.nextInt();
        System.out.print("Enter length of Floar : ");
        int l = sc.nextInt();
        System.out.print("Emnter Width of Floar : ");
        int w = sc.nextInt();
        Floar obj = new Floar(t, l, w); 
        obj.floar();
        System.out.println(obj.Total_T()+" is Requred in the Floar");

    }
}
