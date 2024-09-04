public class ocuurace {
    public static void main(String[] args) {
        
    int arr[] = {12,4,9,2,8,1,19,5};
    int value=11;
    int sum=0;
    int st=0;
    for(int i=0; i<arr.length; i++){
        if(sum<value){
            sum+=arr[i];
            // System.out.println("k "+sum);
        }else{
            sum-=arr[st];
            st++;
            --i;  
        }
        if(value==sum){
            System.out.println("index to "+st+" from "+i);
            sum-=arr[st];
            st++;
        }
        
 }
}
}
