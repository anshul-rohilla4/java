import java.util.Stack;

public class LC20ValidParentheses {
    public static void main(String[] args){
        String s = "((({{{[";

        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {

        Stack<Character> ss=new Stack<>();
        boolean result = true;
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            char open =' ';
            if(c=='(' || c=='{' || c=='[' ){
                ss.push(c);
            }
            else{
                if(ss.isEmpty()) return false;
                open =ss.peek();

                if(c==')'){
                    if(open!='(') return false;
                    else ss.pop();
                }

                else if(c=='}'){
                    if(open!='{') return false;
                    else ss.pop();
                }

                else if(c==']'){
                    if(open!='[') return false;
                    else ss.pop();
                }
            }
        }
        if (!ss.isEmpty()) return false;
        return result;
    }
}
