// 6) Write a java program to find all possible palindrom of given String.
	// Sample Input: “aaabbbacccababacccaabb”
class all{
    static void pelindrome(String st){
        String s=st;
        int count=0;
        for(int i=0; i<s.length(); i++) {
            for (int j=i; j<(s.length()); j++) {
                  String word = null ;
                  word = word+s.charAt(j);
                  for (int k=j; k<i; k--) {
                    String word2 = null;
                    word2 = word2+s.charAt(k);
                    if(word==word2){
                        System.out.print(word+" ");
                        count++;
                    }
                  }
            }
        }System.out.print("\n"+count);
    }
}
public class str6_pelindrome {
    public static void main(String[] args) {
        String s = "aaabbbacccababacccaabb";
        all.pelindrome(s);

    }
}
