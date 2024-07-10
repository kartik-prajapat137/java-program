import java.util.Scanner;

public class j_1_pettern {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

//1.> Rectangal Traingal .
//rectangle = * * * * * *
//rectangle = * * * * * *
//rectangle = * * * * * *
//rectangle = * * * * * *

            // System.out.print("rectangularx =");
            // int rectangularx = sc.nextInt();
            // System.out.print("rectangulary =");
            // int rectangulary = sc.nextInt();

            // for(int i=1; i<=rectangularx; i++){
            //     for(int j=1; j<=rectangulary; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println("");
            // }

// 2.> hollow rectangle;
// * * * * * * 
// *         *
// *         *
// * * * * * * 

            // System.out.print(" hollow rectangularx (4) =");
            // int Hrectangularx = sc.nextInt();
            // System.out.print(" hollow rectangulary (6) =");
            // int Hrectangulary = sc.nextInt();

            // for(int i=1; i<=Hrectangularx; i++){
            //     for(int j=1; j<=Hrectangulary; j++){
            //         if(i==1 || j==1 || i==Hrectangularx || j==Hrectangulary){
            //             System.out.print(" *");
            //         }else{
            //             System.out.print("  ");
            //         }
            //     }
            //     System.out.println("");
            // }

// 3.> Right Angel Traingal.
//*
//**
//***
//**** 
//***** 

            // System.out.print("RightangleTx =");
            // int RightangleTx = sc.nextInt();

            // for(int i=1; i<=RightangleTx; i++){
            //     for(int j=1; j<=i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println("");
            // }

// 4.> Revers Right Angal Traingal 
// * * * * *
// * * * * 
// * * * 
// * * 
// * 


        //  System.out.print("RvRightangleTx =");
        //     int RvRightangleTx = sc.nextInt();

        //     for(int i=0; i<RvRightangleTx; i++){
        //         for(int j=1; j<=RvRightangleTx-i; j++){
        //             System.out.print("*");
        //         }
        //         System.out.println("");
        //     }



//5.> Peramid 
//     *
//    * * 
//   * * * 
//  * * * *
// * * * * *


            // System.out.print(" Peramid X =");
            // int Peramidx = sc.nextInt();
            
            // for(int i=1; i<=Peramidx; i++){
            //     for(int j=1; j<=Peramidx-i; j++){
            //         System.out.print(" ");
            //     }for(int k=1; k<=i; k++){
            //     System.out.print(" *");
            //     }
            //     System.out.println("");
            // }
        

//6.>Peramid2 
//     *
//    *** 
//   ***** 
//  *******
// ********* 
        
            // System.out.print(" Peramid X = ");
            // int Peramidx2 = sc.nextInt();
            
            // for(int i=1; i<=Peramidx2; i++){
            //     for(int j=1; j<=Peramidx2-i; j++){
            //         System.out.print(" ");
            //     }for(int k=1; k<=i*2-1; k++){
            //     System.out.print("*");
            //     }
            //     System.out.println("");
            // }




//7.> Numerical Rectangal.
// 1234567
// 2345671
// 3456712
// 4567123
// 5671234
// 6712345
// 7123456.



        //    System.out.print(" NumRectangal = ");
        //     int NumRectangal = sc.nextInt();

        //     for(int i=1; i<=NumRectangal; i++){
        //         for(int j=i; j<=NumRectangal; j++){
        //             System.out.print(j);
        //         }
        //         for(int k=1; k<i; k++){
        //             System.out.print(k);
        //         }
        //         System.out.println("");
        //     }



//8.> onetwoP
//121212
//212121
//121212
//212121

        //   System.out.print(" one two two one petern how many Times = ");
        //   int onetwoP = sc.nextInt();
          
    
        //   for(int i=1; i<=onetwoP; i++){
        //     for(int j=1; j<=onetwoP+2; j++){
        //         if((i+j)%2==0){
        //             System.out.print(1);
        //         }else{
        //             System.out.print(2);
        //         }
        //     }
        //     System.out.println("");
        //   }
        


//9.> Num Right angal Taingal
//1
//12
//123
//1234


        //   System.out.print("Number 1,12,123 right angal traingal pettern = ");
        //   int NumRighttP = sc.nextInt();

        //   for(int i=1; i<=NumRighttP; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //   }


//10.> Num Peramid 
//    1
//   121
//  12321
// 1234321;


        //   System.out.print("Number 1,121,12321 Peramid pettern = ");
        //   int NumPeramid = sc.nextInt();

        //   for(int i=1; i<=NumPeramid; i++){
        //     for(int j=1; j<=NumPeramid-i; j++){
        //         System.out.print(" ");
        //     }for(int k=1; k<=i; k++){
        //         System.out.print(k);
        //     }for(int l=i-1; l>=1; l--){
        //         System.out.print(l);
        //     }
        //     System.out.println();
        //   }


//11.> Hollow  Triangal
//   1
//  2 2
// 3   3
//4444444 


          System.out.print("Hollow number Traingal = ");
          int HollowNumT = sc.nextInt();

          for(int i=1; i<=HollowNumT; i++){
                for(int j=1; j<=HollowNumT-i; j++){
                        System.out.print(" ");
                }
            for(int k=1; k<=i*2-1; k++){
                if((i==HollowNumT || k==1 || k-i==i-1) ){
                        System.out.print(i);
                }else{
                        System.out.print(" ");
                }
          }
          System.out.println("");
        }



        }
    }
}