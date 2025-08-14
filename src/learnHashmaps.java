import java.util.HashMap;
import java.util.Map;

public class learnHashmaps {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        HashMap<Integer,Integer> nums=new HashMap<>();
        for(int i:nums1){
            if(nums.containsKey(i)){
                nums.put(i,nums.get(i)+1);
            }
            else{
                nums.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : nums.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
