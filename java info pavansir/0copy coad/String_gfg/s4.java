class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        
        //String s="";
        if(arr.length==1){
            if(arr[0].length()==0){
                return "-1";
            }
            return arr[0];
        }
        //min String Length
        
        int min=arr[0].length();
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()<min){
                min=arr[i].length();
            }
        }
        if(min==0){
            return "-13";
        }
        //check str
        String str="";
        int f=0;
        for(int i=0; i<min; i++){
            
            for(int j=0; j<arr.length; j++){
                if(arr[0].charAt(i)!=arr[j].charAt(i)){
                    if(i==0){
                        return "-1";
                    }
                    f=1;
                    break;
                }
            }
            if(f==1){
                return str;
            }
            str+=arr[0].charAt(i);
        }
        return str;
        } 
    }
    public class s4 {
        public static void main(String[] args) {
            Solution obj = new Solution();
            String[] arr = {"geeksforgeeks","geeks","geek","geezer"};
            if(arr.length==1){
               System.out.println(arr.length);
            }
            String s=obj.longestCommonPrefix(arr);
            System.out.println(s);
        }
    }