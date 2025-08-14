import java.util.*;

public class LC49GroupAnagrams {
    public static void main(String[] args){
        String[]  strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=groupAnagrams(strs);
        System.out.println(result);

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result=new HashMap<>();

        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars); //sorted string of chars of s

            result.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }

        return new ArrayList<>(result.values());

    }

}
