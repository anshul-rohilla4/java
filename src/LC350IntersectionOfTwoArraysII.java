import java.util.Arrays;
import java.util.HashMap;

public class LC350IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2,8};
        int[] result =intersect(nums1,nums2);
        for(int i : result){
            System.out.print(i+" ");
        }

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] result=new int[Math.min(nums1.length,nums2.length)];
        int index=0;

        HashMap<Integer,Integer> nums= new HashMap<>();

        boolean n1Small=false;
        if(nums1.length<=nums2.length){
            n1Small=true;
            for(int i:nums1){
                if(nums.containsKey(i)){
                    nums.put(i,nums.get(i)+1);
                }
                else{
                    nums.put(i,1);
                }
            }
            for(int i :nums2){
                if(nums.containsKey(i) && nums.get(i)>0){
                    nums.put(i,nums.get(i)-1);
                    result[index]=i;
                    index++;
                }
            }

        }else{
            for(int i:nums2){
                if(nums.containsKey(i)){
                    nums.put(i,nums.get(i)+1);
                }
                else{
                    nums.put(i,1);
                }
            }
            for(int i :nums1){
                if(nums.containsKey(i) && nums.get(i)>0){
                    nums.put(i,nums.get(i)-1);
                    result[index]=i;
                    index++;
                }
            }
        }



        return Arrays.copyOfRange(result, 0, index); //to return
        // only the elements and not the final zeros to fill the size
    }
}
