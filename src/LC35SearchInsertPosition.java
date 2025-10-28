public class LC35SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {

//        int s = 0;
//        int e = nums.length - 1;
//        int mid = -1;
//        while (s <= e) {
//            int m = s + (e - s) / 2;
//            mid = m;
//            if (nums[m] == target) {
//                return m;
//            }
//            if (nums[m] < target) {
//                s = m + 1;
//            }
//            if (nums[m] > target) {
//                e = m - 1;
//            }
//        }
//        if(nums[mid]<target){
//            return mid+1;
//        }
//        return mid;


        int low=0,right=nums.length-1,index=-1;

        while(low<=right){
            int mid=low+(right-low)/2;
            index=mid;
            if(nums[mid]==target){
               return index;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else right=mid-1;
        }
        if(nums[index]<target ) return index+1;

        return index;

    }
}
