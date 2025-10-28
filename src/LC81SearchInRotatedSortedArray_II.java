public class LC81SearchInRotatedSortedArray_II {
    //the array is pivoted at an index k , check if the target is present in the new array provided ie. nums.
    public static void main(String[] args) {
        int[] nums={1,0,1,1,1};
        int target=0;
        System.out.println(pivot(nums));
        System.out.println(pivotN(nums));
        System.out.println(search(nums,target));

    }
    public static boolean search(int[] nums, int target) {
        int pivot=pivotN(nums);
        if(pivot!=0){
            if(binarySearch(nums,0,pivot-1,target))return true;
            return binarySearch(nums, pivot , nums.length-1, target);
        }


        return binarySearch(nums,0,nums.length-1,target);
    }

    public static boolean binarySearch(int[] nums, int start, int end, int target){
        int low=start;
        int high=end;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public static int pivot(int[] nums){
        int pivot=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                pivot=i;
            }
        }
        return pivot;
    }

    public static int pivotN(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        if(nums[low] < nums[high])return low; // Not rotated

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else if (nums[mid] < nums[high]) {
                high = mid;
            } else {
//                1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1
                if (high > 0 && nums[high - 1] > nums[high]) {
                    return high;
                }
                high--;
            }
        }
        return low;
    }
}
