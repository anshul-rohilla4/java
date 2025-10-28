import java.util.Arrays;
import java.util.HashMap;

public class LC2TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=(twoSum(nums,target));
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {


            HashMap<Integer,Integer> hash=new HashMap<>();
            int index=0;
            for (int num : nums) {

                int rem=target-num;
                if(hash.containsKey(rem) && hash.get(rem)!=index){
                    return new int[]{hash.get(rem),index};
                }
                hash.put(num,index);
                index++;
            }
            return new int[]{-1,-1};


        }

    }

