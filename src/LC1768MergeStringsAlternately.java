public class LC1768MergeStringsAlternately {
    public static void main(String[] args) {
        String word1="a";
        String word2="pqr";
        System.out.println(mergeAlternately(word1,word2));

    }
        public static String mergeAlternately(String word1, String word2) {
            String result="";
            int word1Len=word1.length()-1;
            int word2Len=word2.length()-1;
            int i=0,j=0;

            while(i<=word1Len) {
                if (i <= word1Len) {
                    result += word1.charAt(i);
                    i++;
                }
                if (j <= word2Len) {
                    result += word2.charAt(j);
                    j++;
                }
            }
            if(j<word2Len+1){
                result+=word2.substring(j,word2Len+1);
            }
            return result;


    }
}
