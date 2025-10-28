import java.util.*;

public class LC2273FindResultantArrayAfterRemovingAnagrams {

    public static void main(String[] args) {
        String[] words= {"abba","baba","bbaa","cd","dc"};

        System.out.println(removeAnagrams(words));

    }
    public static List<String> removeAnagrams(String[] words) {

        List<String> res=new ArrayList<>();
        res.add(words[0]);

        for(int i=1;i<words.length;i++){
            if(words[i].length() != res.getLast().length())res.add(words[i]);
            else{
                char[] ch1=words[i].toCharArray();
                char[] ch2=res.getLast().toCharArray();
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                if(Arrays.equals(ch1,ch2)){
                    continue;
                }
                else res.add(words[i]);

            }
        }
        return res;


    }
}
