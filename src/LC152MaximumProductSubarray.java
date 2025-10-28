
public class LC152MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2};
        System.out.println(maxProduct(nums));

    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

        int max = nums[0];//initial max

        int maxP = nums[0];//max product till that index
        int minP = nums[0];//min product till that index
        
        for (int i = 1; i < nums.length; i++) {

            maxP= Math.max(nums[i], Math.max(maxP * nums[i], minP * nums[i]));
            minP = Math.min(nums[i], Math.min(maxP * nums[i], minP * nums[i]));// for negative nums

            max=Math.max(max,maxP);

            System.out.println(i);
            System.out.println("minP: "+minP);
            System.out.println("maxP: "+maxP);
            System.out.println("max: "+max);


        }
        return max;
    }
}