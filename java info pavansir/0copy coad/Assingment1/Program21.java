// package Assingment1;
class Program21{
    public static void main(String args[]){
        System.out.println("----------------p.21---------------");
        int bl=15,bb=8,bh=5,bv;
        int wl=15*100,wb=10*100,wh=8*100,wv,bquantity;
        bv=(bh*bl*bb);
        wv=(wh*wl*wb);
        bquantity=(wv/bv);
        System.out.println("Bricks quntity="+bquantity);

        System.out.println("----------------p.22---------------");
        int pl=50,pw=30,ph=2,pv;
        pv=(ph*pl*pw);
        System.out.println("capacity of pond="+pv);

        System.out.println("----------------p.23---------------");
        int scl=3,scb=3,sch=3,scv;
        int cbl=15,cbb=9,cbh=12,cbv,cb;
        scv=scl*scb*sch;
        cbv=cbl*cbb*cbh;
        cb=cbv/scv;
        System.out.println("box quntity="+cb);

        System.out.println("----------------p.24---------------");
        int bl2=25,bb2=10;
        float bh2=7.5f,bv2;
        int wl2=20*100,wh2=2*100;
        float wb2=0.75f*100;
        double bquantity2,cost,wv2;
        bv2=(bh2*bl2*bb2);
        wv2=(wh2*wl2*wb2);
        bquantity2= (wv2/bv2);
        cost=(bquantity2/1000)*900;
        System.out.println("Bricks cast="+cost);

        System.out.println("----------------p.25---------------");
        int bl3=24,bb3=15,ba3,bricks=100,area_Of_Path;
        ba3=bl3*bb3;
        area_Of_Path=ba3*bricks;
        System.out.println("area Of Path="+area_Of_Path);

        System.out.println("----------------p.26---------------");
        int bl4=24,bb4=15,ba4;
        int lpw=120*100;
        float lpb=2.4f*100 ,lpa,br;
        ba4=(bl4*bb4);
        lpa=(lpw*lpb);
        br= (lpa/ba4);
        System.out.println("Bricks required="+br);

        System.out.println("----------------p.27---------------");
        int drl=20,drw=15,dra,rate=5,cost_of_Tiling;
        dra=drl*drw;
        cost_of_Tiling=dra*rate;
        System.out.println("cost of Tiling a dining room="+cost_of_Tiling);

        System.out.println("----------------p.28---------------");
        int cl=5,cw=4,ca,rate2=205,price;
        ca=cl*cw;
        price=ca*rate2;
        System.out.println("carpet price="+price);

        System.out.println("----------------p.29---------------");
        int a=10,tiles_Area,tiles_quntity;
        int a1=800,a2=900,fa;
        tiles_Area=a*a;
        fa=a1*a2;
        tiles_quntity=fa/tiles_Area;
        System.out.println("tiles quntity="+tiles_quntity);

        System.out.println("----------------p.30---------------");
        int tl=5,tb=8,tiles_Area2,tiles_quntity2;
        int rl=200,rb=400,ra;
        tiles_Area2=tl*tb;
        ra=rl*rb;
        tiles_quntity2=ra/tiles_Area2;
        System.out.println("tiles quntity="+tiles_quntity2);
    }
}