public class leetcode410 {
    //410. Split Array Largest Sum
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        System.out.println(splitArray(nums,2));


    }

    static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;

        for(int i=0 ;i< nums.length;i++){
            start=Math.max(start,nums[i]);//contains max element in the  given array
            end+=nums[i];//sum of elements
        }

        //binary search
        while (start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;//array divided into k pieces

            for(int num :nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }

            if(pieces>k){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;


    }
}
