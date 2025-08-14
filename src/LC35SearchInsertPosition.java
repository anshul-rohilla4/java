public class LC35SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;
        int mid = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            mid = m;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                s = m + 1;
            }
            if (nums[m] > target) {
                e = m - 1;
            }
        }
        if(nums[mid]<target){
            return mid+1;
        }
        return mid;

    }
}
