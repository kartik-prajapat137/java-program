// 17/01/24  1:02 AM ;

//1.>Operators in Java { + , - , * , / , % , ++ , -- ,  , = , == , != ,  > , < , <= , >=}
// 2.>Logical Operators { && , || , !}
// ! = (NOT OPerators) Are Used To Change There Answer is Like To Ture onvert into False & Fals Convert into True
// 3.> Assignment Operators { = , += , -= , /= , %= }



public class j_1_basic_oprators {
    public static void main(String[] args) {
        
        int a=5,b=10,c=15;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a%b);
        System.out.println(--a);
        System.out.println(++a);

        // && AND OPerator
        // evry value is true

        System.out.println((a<b) && (b<c)); //True
        System.out.println((a>b) && (b>c)); //False

        // || OR OPerator
        // any value want to true

        System.out.println((a<b) || (b<c)); //True
        System.out.println((a<b) || (b>c)); //true
        System.out.println((a>b) || (b>c)); //False

        // !() not Operator
        // convert value
        System.out.println(!(a == b));  // True
        System.out.println(!(a<b));  //False
    }
    
}
