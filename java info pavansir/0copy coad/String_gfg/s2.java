public class s2 {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks","geeks","geek","geezer"};
        String s="";
        for(int i=0; i<arr[0].length(); i++){
            if(arr[0].charAt(i)==arr[1].charAt(i)){
                s=s+arr[0].charAt(i);
            }else{
                break;
            }
          }
          int i=0;
          for(i=0; i<arr.length; i++){
            boolean flag=false;
              for(int j=0; j<s.length(); j++){
                  if(arr[i].charAt(j)==s.charAt(j)){
                  }else{
                      System.out.println("Ans: -1");
                      flag=true;
                      break;
                  }
              }
              if(flag){
                break;
              }
          }
          if(i==arr.length){
            System.out.println("ans: "+s);
        }
            
        }
    }
