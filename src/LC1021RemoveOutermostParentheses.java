public class LC1021RemoveOutermostParentheses {
    public static void main(String[] args){
        String s="(()())(())((()))";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
//        int depth=0;
//        String result="";
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='('){
//                if(depth>0){
//                    result+="(";
//                }
//                depth++;
//            }
//            else if(s.charAt(i)==')'){
//                depth--;
//                if(depth>0){
//                    result+=')';
//                }
//            }
//        }
//        return result;

        int depth=0;
        String result="";
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='('){
                if(depth>0){
                    result+="(";
                }
                depth++;
            }
            else{
                depth--;
               if(depth>0){
                   result+=")";
               }
            }
        }
        return result;
    }
}

