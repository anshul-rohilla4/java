import java.util.HashMap;

public class LC3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s= "abcabcbb";


    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        if(s.length()==1)return 1;


        int len=0;
        int currLen=0;
        HashMap<Character,Integer> hash=new HashMap<>();
        for(char c:s.toCharArray()){
            if(!hash.containsKey(c)){
                hash.put(c,1);
                currLen++;
            }
            else{
                len=Math.max(len,currLen);
                currLen=0;
            }
        }
        return len;
    }

}
