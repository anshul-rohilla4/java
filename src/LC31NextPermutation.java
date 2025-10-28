import java.util.Arrays;

public class LC31NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,4,3,5,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        int[] ans={1};


    }
//    Find pivot (rightmost drop):
//    Traverse from the end and find the first index i such that nums[i] < nums[i+1].
//
//    If no such index exists → the array is in descending order → just reverse it.
//
//    Find successor to pivot:
//    From the right side, find the first index j such that nums[j] > nums[i].
//
//    Swap pivot and successor:
//    Swap nums[i] and nums[j].
//
//    Reverse the suffix:
//    Reverse the portion of the array from i+1 to end to make it the smallest possible suffix.

    public static void nextPermutation(int[] nums) {

//        if(nums.length==1)return;
//        if(nums[nums.length-1]>nums[nums.length-2]){
//            swap(nums,nums.length-1,nums.length-2);
//            return;
//        }
//
//
//        int pivot=-1;
//        for(int i=nums.length-1;i>0;i--){
//            if(nums[i-1]<nums[i]){
//                pivot=i-1;
//                break;
//            }
//        }
//        if (pivot == -1) {
//            reverse(nums, 0, nums.length - 1);
//            return;
//        }
//        for(int i=nums.length-1;i>pivot;i--){
//            if(nums[i]>nums[pivot]){
//                System.out.println("nums[i] "+nums[i]);
//                System.out.println("nums[pivot] "+nums[pivot]);
//                swap(nums,pivot,i);
//                break;
//            }
//        }
//        reverse(nums,pivot+1,nums.length-1);

    //

        if(nums.length==1)return;

        int n=nums.length-1;
        int i=n-1;
        while (i>=0 && nums[i]>=nums[i+1]){
            i--;//pivot
        }
        System.out.println(i);
        if(i>=0){
            int j=n;
            while (nums[j]<=nums[i]){
                j--;//greater than pivot
            }
            System.out.println(Arrays.toString(nums));
            System.out.println("nums[i]: "+nums[i]);
            System.out.println("nums[j]: "+nums[j]);


            swap(nums,i,j);

        }

        reverse(nums,i+1,n);



    }


    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
}

