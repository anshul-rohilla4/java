public class leetcode34 {

    //to find start and end index of a target in non-decreasing array
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};


    }
    static int[] searchRange(int[] nums, int target) {
        //time complexity = log n;
        int start =0;
        int end=nums.length-1;
        int mid=0;
        int first=-1;
        int last=-1;
        int [] ans={-1,-1};
        while(start<=end){ //takes log n time
            mid=start+(end-start)/2;

            if(nums[mid]==target){
                first=mid;
                ans[0]=first;
                end=mid-1;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else
                start=mid+1;
        }
        start=0;end=nums.length-1;mid=0; //takes log n time
        while(start<=end){
            mid=start+(end-start)/2;

            if(nums[mid]==target){
                last=mid;
                ans[1]=last;
                start=mid+1;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else
                start=mid+1;
        }
        return ans;


    }


}
