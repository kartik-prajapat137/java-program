public class ocuurace {
    public static void main(String[] args) {
        
    int arr[] = {12,2,9,4,8,1,19,5};
    int value=12;
    int sum=0;
    int st=0;
    for(int i=0; i<arr.length; i++){
        if(sum<value){
            sum+=arr[i];
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
