public class leetcode162 {
    //to find peak element
    public static void main(String[] args) {
    int[] nums= {1,2,3,1};
    int val=findPeakElement(nums);
    System.out.println(val);

    }
    static int findPeakElement(int[] nums) {
        while(nums.length>1){
            if(nums[0]>nums[1]){
                return 0;
            }
            if(nums[nums.length-1]>nums[nums.length-2]){
                return nums.length-1;
            }
            for (int i=1;i<nums.length-1;i++){
                if(nums[i]>nums[i-1]&& nums[i]>nums[i+1])  {
                    return i;
                }
            }
        }return 0;
    }


}
