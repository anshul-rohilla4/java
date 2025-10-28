import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LC128LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums={0,0};
        int res=longestConsecutive(nums);
        System.out.println(res);

    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1) return 1;

//        HashMap<Integer,Integer> hash=new HashMap<>();
//        for(int num:nums){
//            hash.put(num,1); //each num has value 1
//        }
//        int count=0;
//
//        for(int num:nums){  //for (int num : hash.keySet()) {   // iterate over unique keys
//            if (!hash.containsKey(num-1)){
//                int currNum=num;
//                int tempCount=1;
//                while (hash.containsKey(currNum+1)){
//                    tempCount++;
//                    currNum++;
//                }
//                count= Math.max(count,tempCount);
//            }
//
//        }
//        return count;


        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){ //only starts if num is the beginning element
                int currNum=num;
                int count=1;

                while (set.contains(currNum+1)){
                    currNum++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
