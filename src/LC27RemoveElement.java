public class LC27RemoveElement {
    public static void main(String[] args){
        int[] nums = {2,1,2,2,3};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]);
        }
        System.out.println();
        return i;
    }
}
