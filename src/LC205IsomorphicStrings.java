public class LC205IsomorphicStrings {
//    Given two strings s and t, determine if they are isomorphic.
//    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//    All occurrences of a character must be replaced with another character while preserving the order
//    of characters. No two characters may map to the same character, but a character may map to itself.
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));

    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] mapS=new int[256];//includes all ASCII chars
        int[] mapT=new int[256];
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);

            if(mapS[sc]!=mapT[tc]) return false;

            mapS[sc]=i+1;
            mapT[tc]=i+1;
        }
        return true;
    }
}
