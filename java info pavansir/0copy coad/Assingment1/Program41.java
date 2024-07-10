// package Assingment1;

public class Program41 {
    public static void main(String[] args) {
        System.out.println("--------------p.41----------------");
        int h=50,d=30,r=(d/2);
        float pi=3.14f,volume;
        volume=(pi*r*r*h);
        System.out.println("cylinder volume="+volume);

        System.out.println("--------------p.42----------------");
        float h2=2.25f,pi2=3.14f,r2=2.25f/2,volume2;
        volume2=pi2*r2*r2*h2;
        System.out.println("cylinder volume="+volume2);

        System.out.println("--------------p.43----------------");
        double ch=4,csh=5,cr,area,pi3=3.14,rate=10,cost;
        cr= Math.sqrt(csh*csh)-(ch*ch);
        area= Math.sqrt(pi3*cr*cr);
        cost=area*rate;
        System.out.println("the cost of the polishing the base of acone="+cost+"rs");


    }
}
