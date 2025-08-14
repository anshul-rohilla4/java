import java.util.HashMap;

public class LC217ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i:nums){
            if(count.containsKey(i)){
                return true;
            }
            else{
                count.put(i,1);

            }
        }
        return false;
    }
}
