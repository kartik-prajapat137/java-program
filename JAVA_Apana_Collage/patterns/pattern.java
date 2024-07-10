import java.util.*;
public class pattern {
    public static void main(String args[]){
        int n=5;
        int m = 5;
                  

                //1ST RACTANGLE

   // for(int i=1; i<=n; i++){
  //     for (int j=1; j<=n; j++){
  //     System.out.print('*');
 // }System.out.println();
  // }//#//#endregion1

             //   // 2ND HOLLOW RACTANGLE

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i == 1 || j == 1 || i  == n || j == n){
        //             System.out.print("*");}
        //                 else{
        //                     System.out.print(" ");
        //                 }
                    
        //         }System.out.println();//#//#endregion 2
        

                         //3RD HALF PARAMID

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }System.out.println();
// }//#//#endregion 03


                     //4TH OPPSITE HALF PARAMID   

    //  for(int i=n; i>=1; i--){
    //     for(int j=1; j<=i; j++){
    //      System.out.print("*");   
    //     }System.out.println();
    // }


               //5TH INVERTED HALF PARAMIT


    //   for(int i=1; i<=n; i++)
    //   {
    //   for(int j=1; j<=n-i; j++)
    //   {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();

    //   }        


            //6TH NUMBERS PRINT    1
            //                     12
              //                   123
                //                 1234
                
                // for(int i=1; i<=n; i++)
                // {
                //     for (int j=1; j<=i; j++)
                //     {
                //         System.out.print(j);
                //     }System.out.println();
                // }


                     //7TH INVERTED HALF  PARAMID WITH NO.

    //    for(int i=1; i<=n; i++){
    //    for(int j=1; j<=(n-i)+1; j++){
    //     System.out.print(j);
    //    }System.out.println();
    //    }                


                  //8TH FLOYEDS TRAINGLE NO.
    //    int Number =1;
    //  for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print(" "+Number);
    //         Number++;
    //     }System.out.println();
        
    //  }


                      //8TH

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }System.out.println();
        // // }//#//#endregion1



                  // 9TH


        //  for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }System.out.println();
        //  }  
           
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }for(int j=1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }System.out.println();
        //   }//#//#endregion 3
        
        
                     // 10TH

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }for(int j=1; j<=n; j++){
              if((i == 1|| j == m  )|| (i == 5 || j == 1 )){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                
            }
        }System.out.println();
                   // 11TH

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }//#//#endregion5





         }

        }
    }
  
      

    

