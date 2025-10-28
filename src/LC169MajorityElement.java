import java.util.HashMap;
import java.util.Map;

public class LC169MajorityElement {
    //The majority element is the element that appears more than ⌊n / 2⌋ times
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int result=majorityElement(nums);
        System.out.println(result);
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int num:nums){
            if(hash.containsKey(num))hash.put(num,hash.get(num)+1);
            else hash.put(num,1);
        }
        int n=nums.length-1;

        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(entry.getValue()>nums.length/2){
                return  entry.getKey();
            }
        }

        return -1;
    }
}
