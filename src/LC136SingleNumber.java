import java.util.HashMap;

public class LC136SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int num=-1;
        HashMap<Integer,Integer> count =new HashMap<>();
        for(int i:nums){
            if(count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }
            else{
                count.put(i,1);

            }
        }
        for(int i: count.keySet()){
            if(count.get(i)==1){
                return i;
            }
        }



        return num;
    }
}
