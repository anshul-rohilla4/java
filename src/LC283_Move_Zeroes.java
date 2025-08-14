public class LC283_Move_Zeroes {
    public static void main(String[] args){
        int[] nums={0,0,1,0,3,12};
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]==0){
//                for(int j=i; j<nums.length-1; j++){
//                    nums[j]=nums[j+1];
//                }
//                nums[nums.length-1]=0;
//            }
//        }
        int j=-1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                j=i;//index of first 0
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1; i<nums.length ; i++){//index of the next element to 0
                if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                }
                }
        }

        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
