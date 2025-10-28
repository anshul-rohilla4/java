package striverProblems;

import java.util.HashMap;

public class CountSubarraysWithGiven_xor_K {
    //https://takeuforward.org/plus/dsa/problems/count-subarrays-with-given-xor-k
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 6, 6};
        int k = 6;
        System.out.println(subarraysWithXorK(nums,k));
    }
    //brute-force
//    public static int subarraysWithXorK(int[] nums, int k) {
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            int x=0;
//            for(int j=i;j<nums.length;j++){
//                x^=nums[j];
//                if(x==k){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }


    //prefixXOR with hashmap
    public static int subarraysWithXorK(int[] nums, int k) {

        if (nums.length==1 && nums[0]!=k)return 0;

        int count=0;

        HashMap<Integer,Integer> hash=new HashMap<>();

        int prefixXOR=0;

        for(int num:nums){
            prefixXOR^=num;

            if(prefixXOR==k)count++;

            if(hash.containsKey(prefixXOR^k)){
                count+=hash.get(prefixXOR^k);
            }

            hash.put(prefixXOR,hash.getOrDefault(prefixXOR,0)+1);
        }
        return count;
        }


}
