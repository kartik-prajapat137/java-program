import java.util.Scanner;
class Loop {
        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.println("Hello World");
    void loop1(){
        
    int i =12;
    while(i < 11){
        System.out.println(i+"");
        i =     i+1;
    }
    do {
        System.out.println(","+i );
        i = i+1;
    }while(i < 11);

    }
}

public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Loop lo = new Loop();
        System.out.print("Enter a num give sum of total of that num = ");
        int  n = sc.nextInt();
    
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Total sum is = "+sum);

        lo.loop1();
    }
}