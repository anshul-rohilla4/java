public class LC5LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s= "ccd";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {

        if(s.isEmpty()) return "";
        if(s.length()==1)return s; //return the single char.

        if(s.length()==2){ //only 2 chars , so compare both
            if(s.charAt(0)==s.charAt(1))return s;
            else return ""+s.charAt(0); //return a single char
        }

        String res=""+s.charAt(0); //


        for(int i=0;i<s.length()-1;i++){ //for 0 and last index (no palindrome cause no side chars left)
                String temp1=palindrome(s, i,i+1); //even length

                String temp2=palindrome(s, i, i); //odd length

            String temp= temp1.length()>=temp2.length() ? temp1 : temp2; //check the initial max length
            res=res.length()>=temp.length()? res : temp; //compare with global max
        }

        return res;
    }
    public static String palindrome(String s, int l, int r){ //left and right


            while(l>=0 && r<s.length() ){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else  break;
            }
            return s.substring(l+1,r);
    }

}
