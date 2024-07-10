import java.util.Scanner;
class Patterns{
    Scanner sc = new Scanner(System.in);

    //1.*****
    void simple1(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
    }
    //2.*
    // *
    // *
    // *
    // *
    void strate2(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("*");
    }
    }
    //3.*
    //   *
    //    *
    //     *
    //      *
    void band_line3(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        System.out.println("*");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" ");
            }System.out.println("*");
        }
    }
  //4. *****
    // *****
    // *****
    // *****
    // *****
    void Rectangal4(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
            System.out.print("*");
            }System.out.println("\n");
         }
    }
  //5.12345
    //12345
    //12345
    //12345
    //12345
    void one_Nnuml5(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
            System.out.print(j);
            }System.out.println();
         }
    }

   //6.11111
    // 22222
    // 33333
    // 44444
    // 55555

    void one_NnumTrangle6(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
            System.out.print(i);
            }System.out.println();
         }
    }
  //7.1
    //00
    //111
    //0000
    //11111
    void one_Nnum0and17(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0)
                   System.out.print(i%2);
                else
                    System.out.print(i%2);
            }System.out.println();
         }
    }
    //9.
    //*
    //**
    //***
    //****
    //*****
    void str_rightT8(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
         }
    }
    //10.
    //1
    //12
    //123
    //1234
    //12345
    void one_N_RightT9(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }System.out.println();
         }
    }
    //11.
    // 1
    // 22
    // 333
    // 4444
    // 55555
       
    void one_NnumTrangle10(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
            System.out.print(i);
            }System.out.println();
         }
    }
    //.12
    // A
    // AB
    // ABC
    // ABCD
    // ABCDE

    void A_ZnumRTrangle11(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(character);
            character++;
            }System.out.println();
            character=65;
         }
    }
    //.13
    // a
    // ab
    // abc
    // abcd
    // abcde
    
    void a_zRTrangle12(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character = 97;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(character);
            character++;
            }System.out.println();
            character=97;
         }
    }
    //.14
    // 1
    // 01
    // 101
    // 0101
    // 10101
    
    void one_0101_RTrangle13(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                   System.out.print((i+j)%2);
            }System.out.println();
         }
    }
    //.15
    // 1
    // 23
    // 456
    // 78910
    
    void one_NnumRTrangle14(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(k+" ");
            k++;
            }System.out.println();
         }
    }
    //.16
    // A
    // BB
    // CCC
    // DDDD
    // EEEEE
    
    void A_BB_CCCRTrangle15(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(character);
            }System.out.println();
            character++;
         }
        }
    //.17
    // a
    // bc
    // def
    // ghij
    // klmno
    
    void a_zRTrangle16(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character = 97;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(character);
            character++;
            }System.out.println();
         }
        }
    //.18
    // *
    // ##
    // ***
    // ####
    // *****
    
    void str_hashRTrangle17(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0)
                   System.out.print("#");
                else
                    System.out.print("*");
            }System.out.println();
         }
    }
    //.19
    // 1
    // 10
    // 101
    // 1010
    // 10101
    
    void one_NnumTrangle18(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                   System.out.print(k%2);
                   k++;
            }System.out.println();
            k=1;
         }
    }
    //20.
    // *
    // * *
    // *   *
    // *     *
    // * * * * *
    
    void Hollow_S_RTrangle19(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1||j==i||j==1||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }System.out.println();
         }
    }
    //20.
//    1
//    12
//    1 3
//    1  4
//    12345
    
    void Hollow_S_1t_12RTrangle20(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1||j==i||j==1||i==n)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }System.out.println();
         }
    }
    //21.
    // 1
    // 22
    // 3 3
    // 4  4
    // 55555
    
    void Hollow_S_1_22_RTrangle21(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1||j==i||j==1||i==n)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }System.out.println();
         }
    }
    // 22.
    // A
    // AB
    // A C
    // A  D
    // ABCDE
    
    void Hollow_S_A_AB_RTrangle22(){
        System.out.print("Enter any num to for A to Z Hollow Right A Traingle = ");
        int n = sc.nextInt();
        char character=65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1||j==i||j==1||i==n)
                    System.out.print(character);
                else
                    System.out.print(" ");
                    character++;
            }System.out.println();
            character=65;
         }
    }
    //23.
    // a
    // bc
    // d f
    // g  j
    // klmno
    
    void Hollow_a_bc_RTrangle23(){
        System.out.print("Enter any num to for A to Z Hollow Right A Traingle = ");
        int n = sc.nextInt();
        char character=97;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1||j==i||j==1||i==n)
                    System.out.print(character);
                else
                    System.out.print(" ");
                    character++;
            }System.out.println();
         }
    }
    //24.
    // *
    // **
    // *@*
    // *@@*
    // * * * * *
    
    void Hollow_S_atTherate_RTrangle24(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1||j==i||j==1||i==n)
                    System.out.print("*");
                else
                    System.out.print("@");
            }System.out.println();
         }
    }
    //25.
    // 5
    // 54
    // 543
    // 5432
    // 54321
    
    void Hollow_5_54_543_RTrangle25(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=5; i>=5-n; i--){
            for(int j=5; j>=i; j--){
                System.out.print(j);
            }System.out.println();
         }
    }
    //26.
    // *
    // *#
    // *#*
    // *#*#
    // *#*#*
    
    void S_Shash_ShashS_RTrangle26(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j%2==0)
                   System.out.print("#");
                else
                    System.out.print("*");
            }System.out.println();
         }
    }
    //27.
    // 1
    // 10
    // 1 1
    // 1  0
    // 10101
    
    void Hollow_1_10_RTrangle27(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1||j==i||j==1||i==n)
                    System.out.print(j%2);
                else
                    System.out.print(" ");
            }System.out.println();
         }
    }
    //28.
    // 1
    // 123
    // 12345
    // 1234567
    // 123456789
    
    void one_12_123_RTrangle28(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }System.out.println();
         }
    }
    //29.
    // 1
    // 222
    // 33333
    // 4444444
    // 555555555
    
    void one_22_333_RTrangle29(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                    System.out.print(i);
            }System.out.println();
         }
    }
    //30.
    // ***** 
    // **** 
    // ***
    // **
    // * 
    
    void reverse_S_RTrangle30(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                    System.out.print("*");
            }System.out.println();
         }
    }
    //31.
    // 12345
    // 1234
    // 123
    // 12
    // 1
    void reverse_12345_1234_RTrangle31(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                    System.out.print(j);
            }System.out.println();
         }
    }
    // 32.
    // 55555
    // 4444
    // 333
    // 22
    // 1
    
    void reverse_555_44_3_RTrangle32(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                    System.out.print(i);
            }System.out.println();
         }
    }
    //33.
    // ABCDE
    // ABCD
    // ABC
    // AB
    // A
    
    void reverse_ABCDE_ABCD_ABC_RTrangle33(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character=65;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                    System.out.print(character);
                    character++;
            }System.out.println();
            character=65;
         }
    }
    //34.
    // EEEEE
    // DDDD
    // CCC
    // BB
    // A
    
    void reverse_EE5_D4_C3_RTrangle34(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character=(char)(64+n);
 
            for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                    System.out.print(character);
            }System.out.println();
            character--;
         }
    }
    //35.
    // *****
    // *  *
    // * *
    // **
    // *
    
    void reverse_HOLLOW_S_RTrangle35(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1 ; j++){
                if(i==1||j==1||(n-i)+1==j)
                    System.out.print("*");
                else
                     System.out.print(" ");
            }System.out.println();
         }
    }
    //36.
    // ABCDE
    // A  D
    // A C
    // AB
    // A
    
    void reverse_HOllow_ABCDE_AD_RTrangle36(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character=65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1 ; j++){
                if(i==1||j==1||(n-i)+1==j)
                    System.out.print(character);
                else
                     System.out.print(" ");
                    character++;
            }System.out.println();
            character=65;
         }
    }
    //37.
    // *****
    // ####
    // ***
    // ##
    // *
    
    void reverse_S_HAsh_RTrangle37(){
       System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1 ; j++){
               if(i%2==0)
               System.out.print("#");
               else
               System.out.print("*");
            }System.out.println();
         }
    }
    //38.
    // 55555
    // 4  4
    // 3 3
    // 22
    // 1
    
    void reverse_HOllowN_num_RTrangle38(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(i==n||j==1||i==j)
               System.out.print(i);
               else
               System.out.print(" ");
            }System.out.println();
         }
    }
    //39.
    // 123456
    // 54321
    // 1234
    // 321
    // 12
    // 1
    
    void reverse_12345_4321_123_RTrangle39(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        int k=n;
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                if(i%2==0)
               System.out.print(j);
               else
               System.out.print(k-j+1);
            }System.out.println();
            k--;
         }
    }
    //40.
    // *
    // **
    // ****
    // *******
    // ***********
    
    void S_RTrangle40(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        int put=0;
        int count=0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i+put; j++){
                    System.out.print("*");
                    count=j;
            }System.out.println("  "+count);
            put=count;
         }
    }
    //41.
    // A
    // BCD
    // EFGHI
    // JKLMNOP
    
    void A_BCD_EFGHI_Trangle41(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character=65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(i*2-1) ; j++){
                    System.out.print(character);
                    character++;
            }System.out.println();
         }
    }
    //42.
    // 54321
    // 5432
    // 543
    // 54
    // 5
    
    void reverse_54321_5432_RTrangle42(){
        System.out.print("Enter any num to 54321 5432 543 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(j);
            }System.out.println();
         }
    }
    //43
    //     1
    //    12
    //   123
    //  1234
    // 12345
    
    void one_12_123_RTrangle43(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1;k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
               System.out.print(j);
            }System.out.println();
         }
    }
    //44.
    //    1
    //   22
    //  333
    // 4444
    //55555
    
    void one_22_333_RTrangle44(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1;k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
               System.out.print(i);
            }System.out.println();
         }
    }
    //45.
    //     5
    //    44
    //   333
    //  2222
    // 11111
    
    void five_44_333_RTrangle45(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1;k<=i-1; k++)
            System.out.print(" ");
            for(int j=n; j>=i; j--){
               System.out.print(i);
            }System.out.println();
         }
    }
    //46.
    //      A
    //     AB
    //    ABC
    //   ABCD
    //  ABCDE
    
    void A_AB_ABC_RTrangle46(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
        char character=65;
            for(int k=1;k<=i-1; k++)
            System.out.print(" ");
            for(int j=n; j>=i; j--){
               System.out.print(character);
               character++;
            }System.out.println();
         }
    }
    // 47.
    //     1
    //    11
    //   1*1
    //  1**1
    // 11111
    
    void one_11_1S1_1SS1_RTrangle47(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1;k<=i-1; k++)
            System.out.print(" ");
            for(int j=n; j>=i; j--){
                if(j==5||i==1||i==j)
                System.out.print("1");
                else 
                System.out.print("*");
            }System.out.println();
         }
    }
    //48.
    //       A
    //      AB
    //     A_C
    //    A__D
    //   ABCDE
    
    void A_AB_A_C_A___DRTrangle48(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
        char character=65;
            for(int k=1;k<=i-1; k++)
            System.out.print(" ");
            for(int j=n; j>=i; j--){
                if(j==5||i==1||i==j)
                System.out.print(character);
                else 
                System.out.print("_");
                character++;
            }System.out.println();
         }
    }
    //49.
    //     1
    //    10
    //   101
    //  1010
    // 10101
    
    void one_10_101_1010_RTrangle49(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1;k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
                if(j%2==0){
                    System.out.print("0");
                }else
                System.out.print("1");
            }System.out.println();
         }
    }
    //50.
    void reverse_HOllow_ABCDE_AD_RTrangle50(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character=65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1 ; j++){
                if(i==1||j==1||(n-i)+1==j)
                    System.out.print(character);
                else
                     System.out.print(" ");
                    character++;
            }System.out.println();
            character=65;
         }
    }
    
    




    


}

public class j2_Patterns {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        Patterns pa = new Patterns();
        // pa.one_Nnuml5();
        // pa.one_Nnum0and17();
        // pa.A_ZnumRTrangle11();
        // pa.a_zRTrangle12();
        // pa.one_0101_RTrangle13();
        // pa.one_NnumRTrangle14();
        // pa.A_BB_CCCRTrangle15();
        // pa.a_zRTrangle16();
        // pa.str_hashRTrangle17();
        // pa.one_NnumTrangle18();
        // pa.Hollow_S_RTrangle19();
        // pa.Hollow_S_1to2RTrangle20();
        // pa.Hollow_S_1_22_RTrangle21();
        // pa.Hollow_S_A_AB_RTrangle22();
        // pa.Hollow_a_bc_RTrangle23();
        // pa.Hollow_S_atTherate_RTrangle24();
        // pa.Hollow_5_54_543_RTrangle25();
        // pa.S_Shash_ShashS_RTrangle26();
        // pa.Hollow_1_10_RTrangle27();
        // pa.one_12_123_RTrangle28();
        // pa.one_22_333_RTrangle29();
        // pa.reverse_S_RTrangle30();
        // pa.reverse_12345_1234_RTrangle31();
        // pa.reverse_555_44_3_RTrangle32();
        // pa.reverse_ABCDE_ABCD_ABC_RTrangle33();
        // pa.reverse_EE5_D4_C3_RTrangle34();
        // pa.reverse_HOLLOW_S_RTrangle35();
        // pa.reverse_HOllow_ABCDE_AD_RTrangle36();
        // pa.reverse_S_HAsh_RTrangle37();
        // pa.reverse_HOllowN_num_RTrangle38();
        // pa.reverse_12345_4321_123_RTrangle39();
        // pa.S_RTrangle40();
        // pa.A_BCD_EFGHI_Trangle41();
        // pa.reverse_54321_5432_RTrangle42();
        // pa.one_12_123_RTrangle43();
        // pa.one_22_333_RTrangle44();
        // pa.five_44_333_RTrangle45();
        // pa.A_AB_ABC_RTrangle46();
        // pa.one_11_1S1_1SS1_RTrangle47();
        // pa.A_AB_A_C_A___DRTrangle48();
        pa.one_10_101_1010_RTrangle49();
    }
}
