public class LC34FindFirstAndLastPositionOfElement_In_SortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target=1;
        int[] result=searchRange(nums,target);
        for(int i:result){
            System.out.print(i+" ");
        }
        
    }
    public static int[] searchRange(int[] nums, int target) {
//        int[] result={-1,-1};
//        int start=-1;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target ){
//                start=i;
//                result[0]=i;
//                break;
//            }
//        }
//        if(start!=-1){
//            for(int i=nums.length-1;i>=start;i--){
//                if (nums[i]==target){
//                    result[1]=i;
//                    break;
//                }
//            }
//        }
//        return result;
        int[] res= {-1,-1};

        if(nums.length==0)return res; //empty nums
        if(nums.length==1){ // target not present
            if(nums[0]!=target)return res;
            else return new int[]{0,0};
        }

        int low=0;
        int high=nums.length-1;

        boolean present=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                present=true;
                while(mid>0 && nums[mid-1]==target)
                    mid-=1;
                res[0]=mid;
                low=mid;
                break;
            }else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        if(!present){
            return new int[]{-1,-1}; //target is not present
        }
        if(low==nums.length-1)return new int[]{low,low}; //target is present only once at [nums.length-1]

        high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                while(mid<nums.length-1 && nums[mid+1]==target){
                    mid+=1;
                }
                res[1]=mid;
                break;
            }
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }



        return res;
    }
}
