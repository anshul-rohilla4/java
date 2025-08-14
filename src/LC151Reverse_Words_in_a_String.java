import java.util.ArrayList;

public class LC151Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
//            ArrayList<String> words =new ArrayList<>();
//            String word = "";
//
//            for (int i = 0; i < s.length(); i++) {
//                char ch=s.charAt(i);
//                if(ch!=' '){
//                    word+=ch;
//                }
//                else if(!word.isEmpty()){
//                    words.add(word);
//                    word="";
//                }
//            }
//
//            String result="";
//            for(int i=words.size()-1 ; i>=0; i--){
//                result+=words.get(i);
//                if(i>0) result+=" ";
//            }
//
//            return result;
//            }

        ArrayList<String> words = new ArrayList<>();
        String word = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                words.add(word);
                word = "";
            }
        }
        if (!word.isEmpty()) {
            words.add(word);
        }
        for (int i = words.size() -1; i >= 0; i--) {
            result += words.get(i);
            if (i > 0) {
                result += " ";
            }
        }


        return result;
    }
}

