import java.util.Stack;

public class LC26RemoveDuplicatesfromSortedArray {
    public static void main(String[] args){
        int[] nums={0,0,1,1,1,2,2,3,3,4,9,10,10,13};
        System.out.println(removeDuplicates(nums));


    }
    public static int removeDuplicates(int[] nums) {
        // in-place transformation of the provided array and O(n) time complexity;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;




//        time complexity =O(n2); and no in-place transformation of the provided array ,as stack is being used;
//        int count=-1;
//        Stack<Integer> ss =new Stack<>();
//        ss.push(nums[0]);
//        for(int i=1; i<nums.length ;i++){
//            if(ss.contains(nums[i])) continue;
//            else ss.push(nums[i]);
//        }
//        count=ss.size();
//        for( int i=0;i<count;i++){
//            nums[i]=ss.elementAt(i);
//        }
//        return count;
    }
}
