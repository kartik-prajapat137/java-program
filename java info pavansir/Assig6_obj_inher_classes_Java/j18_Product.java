// 18) Create class Product (pid, price, quantity) with parameterized constructor.
// Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) 
// in XYZ class to calculate and return total amount spent on all products. 
// (amount spent on single product=price of product * quantity of product).

import java.util.Scanner;

class Product {
    Scanner sc = new Scanner(System.in);
        private  int n=1;
        private String[] prod_id ;
        private int[] prod_quantity;
        private int[] prod_price;

    Product(int n){
        this.n=n;
        prod_id = new String[n];
        prod_quantity = new int[n];
        prod_price = new int[n];

    }
    public void prod_init(){
        System.out.println("Enter Product Id or Price and quality :");
        for (int i=0; i<n; i++) {
            System.out.print(i+1+" Enter Id : ");
           this. prod_id[i] = sc.next();
            System.out.print(i+1+"Enter price : ");
           this.prod_price[i] = sc.nextInt();
            System.out.print(i+1+"Enter quantity : ");
            this. prod_quantity[i] = sc.nextInt();
        }
    }
    public String highest_p(){
        int highest= prod_price[0];
        int x=0;
        for (int i=0; i<n; i++) {
            if(prod_price[i]>highest){
                highest=prod_price[i];
                x=i;
            }
        }
        return prod_id[x];
    }
    int Total_A = 0;
    public int Total_Amount(){
        for (int i=0; i<n; i++) {
            Total_A += (prod_price[i]*prod_quantity[i]);
        }
        return Total_A;
    }   
}
public class j18_Product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. Of Product is here : ");
        int n = sc.nextInt();
        System.out.println();
        Product obj = new Product(n);
        obj.prod_init();
        String k = obj.highest_p();
        System.out.println("Highest price PRoduct Id : "+k);
        System.out.println("Total Amount of All Products : "+obj.Total_Amount());
    }
}

