public class LC1071GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1="ABCABC";
        String str2="ABC";
        System.out.println(gcdOfStrings(str1,str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        String result="";

        if(str1+str2 != str2+str1){
            return result;
        }

        
        return result;
    }
}
