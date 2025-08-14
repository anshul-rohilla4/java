public class Left_Rotate_an_array_by_one_place {
        public static void main(String[] args) {

            int[] nums ={3, 6, 1,0,2,4,2,4,99,111};
//        int[] numsSorted={-12,0,1,2,3,4,7,9,90,123,321,432,5432,7543};
//        int[] numsSorted2={-12,0,1,2,3,4,7,9,90,123,321,432,5432,7543,0};

            leftShift(nums);
            for(int i :  nums){
                System.out.print(i+" ");
            }
        }

        public static int[] leftShift(int[] nums){
            int firstElement=nums[0];
            for(int i=0;i<nums.length-1; i++){
                nums[i]=nums[i+1];
            }
            nums[nums.length-1]=firstElement;

            return nums;
        }
    }


