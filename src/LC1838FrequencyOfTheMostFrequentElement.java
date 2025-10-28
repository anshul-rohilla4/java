import java.util.Arrays;

public class LC1838FrequencyOfTheMostFrequentElement {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,4};
        int k=2;

        int result=maxFrequency(nums,k);
        System.out.println(result);


    }
    public static int maxFrequency(int[] nums, int k) {

        //sort array

//        for(int i=0;i<nums.length;i++){  //O n^2
//            for(int j=0;j<=i;j++){
//                if(i==j) continue;
//                if(nums[i]<=nums[j]){
//                    temp(nums,i,j);
//                }
//            }
//        }

        Arrays.sort(nums); //O n log n

//        int left=0;
//        int sum=0;
//        int res=1; // initial count of every element;
//
//        for(int right=0;right<nums.length;right++){
//            sum+=nums[right];
//            while ((long)nums[right]*(right-left+1)-sum>k){
//                sum-=nums[left];
//                left++;
//            }
//            res=Math.max(res,right-left+1);
//        }
//        return res;

        int left=0,right=0;
        int res=1;
        long sum=0;

        while(right<nums.length){
            sum+=nums[right];


//            shrink window if cost > k
            while ( (long)nums[right]*(right-left+1) > sum+k ){ //when invalid window

                sum-=nums[left];
                left++;

            }
            res=Math.max(res,right-left+1);

            right++;
        }
        return res;
    }
    public static void temp(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
