public class LC33SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(search(nums,4));

    }
    public static int search(int[] nums, int target){
        if(nums.length==1 && nums[0]!=target)return -1;

        if(nums[0]<nums[nums.length-1]) return binaryS(nums, 0, nums.length-1, target);

        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high])low=mid+1;
            else high=mid;
        }
        if(nums[0]<=target && target<=nums[high-1])return binaryS(nums, 0, high-1, target);
        else return binaryS(nums, high, nums.length-1, target);
    }
    public static int binaryS(int[] nums, int low, int high, int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)high=mid-1;
            else low=mid+1;
        }
        return -1;
    }

}
