import java.lang.reflect.Array;
import java.util.Arrays;

public class FloorAndCeil_InSortedArray {
//Given a sorted array nums and an integer x. Find the floor and ceil of x in nums.
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.
// If no floor or ceil exists, output -1.

    public static void main(String[] args){
        int[] nums={3, 4, 4, 7, 8, 10};
        int x=5;
        int[] ans=getFloorAndCeil(nums,x);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int[] ans=new int[]{-1,-1};
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


    //only gives ciel and floor ok 'k' else -1
    public static int[] sol(int[] nums,int k){
        if(nums.length==0)return new int[]{-1,-1};

        int[] res=new int[]{-1,-1};
        int low=0;
        int high=nums.length-1;

        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==k){
                if(mid-1>=0 && nums[mid-1]<k){
                    res[0]=mid-1;
                }
                high=mid-1;
            }else if(nums[mid]>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        low=res[0]+1;
        high=nums.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==k){
                if(mid+1<=nums.length-1 && nums[mid+1]>k){
                    res[1]=mid+1;
                }
                low=mid+1;
            }else if(nums[mid]>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }


        return res;

    }



}
