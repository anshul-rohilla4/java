import java.util.HashMap;

public class LC3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s= "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        if(s.length()<2)return s.length();//either no or single character, so return the length itself

        int len=0;//max length
        int currLen=0; // current length from the last same character
        HashMap<Character,Integer> hash=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                currLen=Math.max(currLen,hash.get(s.charAt(i))+1);
            }
            hash.put(s.charAt(i),i); //put the index of the initial or last seen index
            len=Math.max(len,i-currLen+1);
        }

        return len;
    }

}
