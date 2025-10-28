import java.util.Arrays;
import java.util.HashMap;

public class LC349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1},nums2={2,2};

        int[] result=intersection(nums1,nums2);
        for(int i:result){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        int[] result=new int[Math.min(nums1.length,nums2.length)];
        int index=0;

        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i:nums1){
            if(hash.containsKey(i)){
                continue;
            }else{
                hash.put(i,1);
            }
        }

        for(int i:nums2){
            if(hash.containsKey(i)){
                hash.remove(i);
                result[index]=i;
                index++;
            }
        }
        return Arrays.copyOf(result,index);

    }
}

