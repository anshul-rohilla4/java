public class LC53MaximumSubarray {
    public static void main(String[] args) {
        int[] nums= {5,4,-1,7,8};
        int result=maxSubArray(nums);
        System.out.println(result);
    }
    public static int maxSubArray(int[] nums) {
        if (nums.length==1) return nums[0];
        int sum=nums[0];
        int currSum=nums[0];
        for (int i = 1; i <nums.length; i++) {
            currSum=Math.max(nums[i],currSum+nums[i]);
            sum=Math.max(currSum,sum);
            System.out.println("currSum:"+currSum);
            System.out.println("sum: "+sum);
        }
        return sum;




    }
}
