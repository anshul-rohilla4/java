public class nearestToX {

    //given a sorted array, find the closest value to X in the array
    public static void main(String[] args) {
        int[] nums={1,6,9,12,14,765,2311,13432,999999};
        int x=99999;

        System.out.println(nearestVal(nums,x));
    }

    public static int nearestVal (int [] nums,int x){
        if(nums.length==0)return -1;
        if(nums.length==1)return nums[0];

        if(nums[0]>=x){
            return nums[0];
        }
        if(nums[nums.length-1]<=x){
            return nums[nums.length-1];
        }

        int low=0;
        int high=nums.length-1;
        int mid=-1;

        while(low<=high){
            mid=low+(high-low)/2;

            if(nums[mid]==x)return nums[mid];

            else if(nums[mid]<x)low=mid+1;
            else high=mid-1;


        }
        if (x - nums[high] < nums[low] - x) {
            return nums[high];
        } else return nums[low];


    }
}
