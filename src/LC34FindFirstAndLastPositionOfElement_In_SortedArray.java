public class LC34FindFirstAndLastPositionOfElement_In_SortedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int target=1;
        int[] result=searchRange(nums,target);
        for(int i:result){
            System.out.print(i+" ");
        }
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        int start=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target ){
                start=i;
                result[0]=i;
                break;
            }
        }
        if(start!=-1){
            for(int i=nums.length-1;i>=start;i--){
                if (nums[i]==target){
                    result[1]=i;
                    break;
                }
            }
        }
        return result;
    }
}
