package TestPreperation;

public class j6_primeINarray {
    public static void main(String[] args) { 
        int[] arr = {1,2,4,6,3,7,8};

        boolean flag2=true;
        for (int i=0; i<arr.length; i++) {
            boolean flag=true;
            if(arr[i]>=2){
            for (int j=2; j<arr[i]; j++) {
                if(arr[i]%2==0){
                    flag=false;
                    flag2=false;
                    break;
                }
            }if(flag){
                System.out.println(arr[i]+" is on idx "+i+" is prime: ");
            }
        }
        }if(flag2){
            System.out.println("There is not present any prime number:");
        }
    }
}
