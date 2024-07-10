import java.util.Scanner;

class loop{
    Scanner sc = new Scanner(System.in);
    

    // 2) WAP to print N natural number.
    void N_natural2(){
        System.out.print("Enter  Num For Natural Num = ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }  
    //3) WAP to find out the sum of N natural number.
    void s_Nnum3(){
        int i=1;
        int sum=0;
        System.out.print("ENter N Number = ");
        int n = sc.nextInt();
        while (i<=n){
            sum=sum+i;
            i++;
        }System.out.println("sum = "+sum);
    }
    // 4) WAP to print table of a number.
    void table_Nnum4(){
        System.out.print("Enter Any Num For Table = ");
        int n = sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.print(" "+i*n);
            i++;
        }
    }
    //5) WAP to find out the factorial of a number.
    void factorial5(){
        System.out.print("Enter Any Num For Table = ");
        int n = sc.nextInt();
        int i=0;
        int sum=1;

        while (n!=0){   
             sum=sum*n; 
             n--;
        }
        System.out.println(" "+sum);
    }
    //7) WAP to check whether entered number is prime or not.
    void check_n_prime7(){
        System.out.print("Enter num for Checking num is prime or not = ");
        int n = sc.nextInt();
        int i=2;
        boolean num = true; 
        while (i<n) {
            if(n%i==0){   //1st no prime nhi hota h 2 se prime no. start hota h 
            num = false;
            break;
            }
            System.out.println(i);
            i++;
        }if(num==true)
        System.out.println("You Entered Number is prime = "+n);
        else
        System.out.println("You Entered Number is not prime = "+n);
    }
    //7.2
    void check_n_prime7_2(){
        System.out.print("Enter num for Checking num is prime or not = ");
        int n = sc.nextInt();
        int i=2;
        while (i<=(n/2)) {
            if(n%i==0)
            break;
            i++;
        }if(i>(n/2)&& n>1)
        System.out.println("You Entered Number is prime = "+n);
        else
        System.out.println("You Entered Number is not prime = "+n);
    }

    //8) WAP to print Fibonacci series.
    void Fibonacci8(){
        System.out.print("Enter Any num for Fabonacci Num  = ");
        int n = sc.nextInt();
        int i=1;
        int a=1;
        int b=1;
        System.out.print("0 1 1");
        while (i<=n) {
        int temp =a;  
            a=b;
            b=temp+b;
            System.out.print(" "+b);
            i++;
        }
    }
    // 9) WAP to print N even numbers.
    void Neven_num9(){
        System.out.print("Enter num for extract Even Num = ");
        int n = sc.nextInt();
        int i=1;
        while(i<n){
            if(i%2==0){
                System.out.print(" "+i);
            }
            i++;
        }
    }
    //11) WAP to print N odd numbers.
    void Nodd_num11(){
        System.out.print("Enter num for extract Odd Num = ");
        int n = sc.nextInt();
        int i=1;
        while(i<n){
            if(i%2!=0){
                System.out.print(" "+i);
            }
            i++;
        }
    }
    //13) WAP to print N natural numbers in reverse order
    void N_natural_rev13(){
        System.out.print("Enter N Natural num in Reveres Order = ");
        int n = sc.nextInt();
        int i=n;
        while(i!=0){
            System.out.print(i+" ");
            i--;
        }
    } 
    // 14) WAP to print alphabets in uppercase
    void Alpha_Upper_14(){
        char alphabets = 'A';
        while (alphabets<91) {
            System.out.print(" "+alphabets);
            alphabets++;
        }
    }
    // 15) WAP to print alphabets in lowercase
    void alpha_Lower_15(){
        char alphabets = 'a';
        while (alphabets<123) {
            System.out.print(" "+alphabets);
            alphabets++;
        }
    }
    //16) …... -6	-3	0	3	6	9	……. n terms	 
    void integer_Anth16(){
        System.out.print("Enter N Natural num in Reveres Order = ");
        int n = sc.nextInt();
        int i=1;
        int a= -6;
        int b=-3;
        int d=b-a;
        int anth ;

        anth = a+(n-1)*d;
        System.out.println(anth);

        // while (i<=n) {

        //      System.out.println(anth);
        //     i++;
        // }
    }
    //17) 1 	2	 4	 7	 11	 16 	…… n terms
    void sesres_17(){
        System.out.print("Enter n num for series is 1,2,4,7,11.... = ");
        int n = sc.nextInt();
        int series=1;
        for(int i=1; i<n;i++){
            System.out.print(series+",");
            series = series+i;
        }
    }
    //18) 1	2	2	4	8	32	…… n terms.
    void series_18(){
        System.out.print("Enter n num for series is 1,2,4,7,11.... = ");
        int n = sc.nextInt();
        int a=1,b=2,c;
        for(int i=1; i<=n; i++){
            System.out.print(b+", ");
            c=b*a;
            a=b;
            b=c;
        }

    }
    //32) A	b	C	d	E	f	G	h	…… n terms 
    void AbCd_32(){
        System.out.print("Enter n for print A b C d E f... = ");
        int n = sc.nextInt();
        char character = 65;
        char c=32;
        for(int i=1; i<=n;i++){
        if(i%2!=0){
            System.out.print(character+", ");
            character++;
            character=(char)(character+c);
        }else{
            System.out.print(character+", ");
            character++;
            character=(char)(character-c);
        }
    }
    }
    //33) WAP to print Alphabets in reversing order.
    void Alpha_Revers_33(){
        char i = 122;
        while(i>96){
            System.out.print(" "+i);
            i--;
        }
    }
    //35) WAP to count number of digits
    void count_nDigits35(){
        System.out.print("Enter any num we count digits of that num = ");
        int n = sc.nextInt();
        int i=0;
        while (n>0){
            int divid = n%10;
                    n = n/10;
                    i++;
        }System.out.println("Total Digits Are = "+i);
    }
    //36) WAP to reverse a number
    void Reveres_num36(){
        System.out.print("Enter any num For Revers of that num = ");
        int n = sc.nextInt();
        int i=0;
        while (n>0){
            int divid = n%10;
                    n = n/10;
                    i=((i*10)+divid);
        }System.out.println("Riveres of num is = "+i);
    }//37) WAP to check whether entered number is palindrome or not
     // palindrome = 121,22,636,424
    void Check_palindrome37(){
        System.out.print("Enter any num For Checking num is palindrome or not = ");
        int n = sc.nextInt();
        int i=0;
        int temp = n;
        while (n>0){
            int divid = n%10;
                    n = n/10;
                    i=((i*10)+divid);
        }if(temp==i)
            System.out.println("Number is palindrome  "+temp+" = "+i);
        else
        System.out.println("Number is not palindrome "+temp+" = "+i);
    }
    //38) WAP to check whether entered number is Armstrong or not
    // Armstrong = 407=4^3+0^3+7^3=407,23=2^2+3^2=23
    void Armstrong_check_38(){
        System.out.print("Enter any num For Checking num is Armstrong or not = ");
        int n = sc.nextInt();
        int temp=n;
        int check=n;
        int i=0;
        int Armstrong=1;
        int armst2=0;
        while (n>0) {
            int divid = n%10;
                    n = n/10;
                    i++;//length
        };int k=i;//length to new variable
        while (i>0) {
            int modulo = temp%10;
                 temp = temp/10;
                 for(int run=1; run<=k; run++){
                  Armstrong = modulo*Armstrong;
                 }
                 armst2=armst2+Armstrong;
                 Armstrong = 1;
                 i--;
        }if(armst2==check)
            System.out.println("Your number is Armstrong "+check+ " = "+armst2);
        else
        System.out.println("Your number is not  Armstrong "+check+ " != "+armst2);
    }
    //39) WAP to check whether entered number is strong or not
    // Strong = 145=1!+4!+5!,1=1!,40585=4!+0!+5!+8!+5!;
    void Strong_check_39(){
        System.out.print("Enter any num For Checking num is strong or not = ");
        int n = sc.nextInt();
        int ncopy =n;
        int strong=0;
        while (n>0){
            int divid = n%10;
                    n = n/10;
            int  temp = divid;
            int newTemp =1;
            while (temp>0) {
                     newTemp=newTemp*temp;
                     temp--;
            }
            strong += newTemp;
        }if(strong==ncopy)
        System.out.println("Your Num is Strong "+ncopy+" = "+strong);
        else
        System.out.println("your Num is NOt Strong "+ncopy+" = "+strong);
    }
    //40) WAP to count no. Of even and odd digits in a number
    void Even_Odd_count_D_40(){
        System.out.print("Enter any num to find even and odd  and zero total Digot of Tht Num = ");
        int n = sc.nextInt();
        int i=0;
        int even = 0;
        int odd = 0;
        int zero=0;
        while (n>0){
            int divid = n%10;
                    n = n/10;
                    i=divid;
                    if(i!=0&&i%2==0)
                    even++;
                    else if(i%2!=0)
                    odd++;
                    else 
                    zero++;
        }System.out.println("Total Even Digit in the num is = "+even);
        System.out.println("Total Odd Digit in the num is = "+odd);
        System.out.println("Total Zero Digit in the num is = "+zero);
    }
    //41) WAP to find out LCM of a number
    // factor of that value;ex:-24=2*2*2*3;
    void Lcm_41(){
        System.out.print("Enter any num  to find LCM = ");
        int n = sc.nextInt();
        int temp=1;
        if(n==1){
            System.out.println("LCM of Num is =1");
        }else{    
        int i=2;
        while (n>1&&i>=2) {
            if(n%i==0){
              n/=i;
              temp*=i;  
              System.out.print(" "+i);
            }else{
                i++;
            }
        }System.out.println("\n LCM of Num is = "+temp);
    }
  }
    //42) WAP to find out HCF of a number
    // extract common two factors ex:-24=2*2*2*3=2*2*3
    void HCF_42(){
        System.out.print("Enter any num  to find HCF = ");
        int n = sc.nextInt();
        int temp=1;
        int check=1;
        if(n==1){
            System.out.println("HCF of Num is = 1");
        }else{    
        int i=2;
        while (n>1&&i>=2) {
            if(n%i==0){
              n/=i;
              if(check<=1){
               temp*=i; 
               System.out.print(" "+i);
               check++;
               }else{
               check=1;
               } 
            }else{
                i++;
                check=1;
            }
        }
    }
    System.out.println("\n HCF of Num is = "+temp);
}
//43) WAP to convert binary number into decimal number
//44) WAP to interchange first and last digit of a number
// 
void entrChang1_to_last44(){
    System.out.print("Enter any num to exchange = ");
    int n = sc.nextInt();
    int last=n%10;
    int first=0;
    int num =n;
    int i=0;
    int temp=1;
    int mul=1;
    int divide;
    while (n>0){
         first = n%10;
         n = n/10; 
         i++;
    }while(temp<i){
        mul = mul*10;
        temp++;
    }
    int first_delete = num%mul;
     int local = (mul*last)+first_delete;
     int last_delete = local/10;
     int local2 = (last_delete*10)+first;
     System.out.println("Rverese valuue of "+num+" = "+local2);
}
//45) WAP to find out the sum of all the digits of a number
    void Sum_All_Di45(){
        System.out.print("Enter any num to sum of that Num = ");
        int n = sc.nextInt();
        while (n>0) {
            int modulo = n%10;
            int divide = n/10;

        }
    }
//46) WAP to find out the sum of first and last digit of a user entered number 
void Sum_frst_lst_46(){
    System.out.print("Enter any value sum of first and last digit of that is = ");
    int n = sc.nextInt();
    int last=n%10;

    int first=0;
    while (n>0){
        first = n%10;
        n = n/10; 
   }System.out.println("SUM of first and last Digit is = "+(first+last));
}
//



}

public class j1_loop {
    public static void main(String[] args) {
        loop l = new loop();
        // l.N_natural2();
        // l.s_Nnum3();
        // l.table_Nnum4();
        // l.factorial5();
        // l.check_n_prime7();
        // l.check_n_prime7_2();
        // l.Neven_num();
        // l.Fibonacci8();
        // l.Neven_num9();
        // l.Nodd_num11();
        // l.N_natural_rev13();
        // l.Alpha_Upper_14();
        // l.alpha_Lower_15();
        // l.integer_Anth16();
        // l.sesres_17();
        l.series_18();
        // l.AbCd_32();
        // l.Alpha_Revers_33();
        // l.count_nDigits35();
        // l.Reveres_num36();
        // l.Check_palindrome37();
        // l.Armstrong_check_38();
        // l.Strong_check_39();
        // l.Even_Odd_count_D_40();
        // l.Lcm_41();
        // l.HCF_42();
        // l.entrChang1_to_last44();
        // l.Sum_frst_lst_46();
    }
}
