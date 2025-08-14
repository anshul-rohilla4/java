public class FloorAndCeil_InSortedArray {
//Given a sorted array nums and an integer x. Find the floor and ceil of x in nums.
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.
// If no floor or ceil exists, output -1.

    public static void main(String[] args){
        int[] nums={3, 4, 4, 7, 8, 10};
        int x=5;
        int[] ans=getFloorAndCeil(nums,x);

        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int mid=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            mid=m;
            if (nums[m] == x) {
                ans[0]=nums[m];//floor
                ans[1]=nums[m];//ceil
                return ans;
            }
            if (nums[m] < x) {
                s = m + 1;
                ans[0]=nums[m];
            }
            if (nums[m] > x) {
                e = m - 1;
                ans[1]=nums[m];
            }
        }
        return ans;
    }
}
