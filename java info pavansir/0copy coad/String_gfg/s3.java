class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String s="";
        int i2 =arr[0].length();
        if(arr[0].length()<arr[1].length()){
            i2=arr[1].length();
        }if(i2>0){
        for(int i=0; i<i2; i++){
            if(arr[0].charAt(i)==arr[1].charAt(i)){
                s=s+arr[0].charAt(i);
            }else{
                break;
            }
          }
        }else{
            return "-1";
        }
          int i=0;
          for(i=0; i<arr.length; i++){
            //   boolean flag=false;
            if(arr[i].length()>s.length()&&s.length()>0){
              for(int j=0; j<s.length(); j++){
                  if(arr[i].charAt(j)==s.charAt(j)){
                      
                  }else{
                      return "-1";
                  }
              }
              }else{
                  return "-1";
              }
          }
            return  s;
        }
    }
public class s3 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] arr = {"aakjkj","","aajh","aakhg"};
        System.out.println("hiuh"+obj.longestCommonPrefix(arr));
    }
}
