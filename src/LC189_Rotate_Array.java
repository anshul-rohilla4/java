public class LC189_Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;//shift k times to the right

        //from nums.length-k index put the elements first then shift the remaining elements
//        int[] shiftElements=new int[k];
//        int shiftIndex=0;
//        if(nums.length!=1){
//
//            for(int i=nums.length-k; i<nums.length;i++){
//                shiftElements[shiftIndex]=nums[i];
//                shiftIndex++;
//            }
//
//            for (int i = nums.length-1; i>=k; i--) {
//                nums[i]=nums[i-k];
//            }
//            for(int i=0;i<k;i++){
//                nums[i]=shiftElements[i];
//            }
//        }


        if (nums.length <= 1) return;
        k = k % nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);

        for(int i:nums){
            System.out.print(i+" ");
        }

    }
    public static void reverse(int[] arr ,int start ,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}