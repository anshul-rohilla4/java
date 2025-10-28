import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC2149RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};

        System.out.println(Arrays.toString(rearrangeArray(nums)));

    }
    public static int[] rearrangeArray(int[] nums) {

//        int index=0;
//
//        int positiveI=-1;
//        while (index<nums.length){
//            if(nums[index]>=0){
//                positiveI=index;
//                break;
//            }
//            index++;
//        }
//        if(positiveI==-1) return nums; //no positive nums
//
//        index=0;
//
//        int negativeI=-1;
//        while (index<nums.length){
//            if(nums[index]<0){
//                negativeI=index;
//                break;
//            }
//            index++;
//        }
//        if(negativeI==-1)return nums;//no negatives
//
//        List<Integer> pos=new ArrayList<>(),neg=new ArrayList<>();
//        for (int num : nums) {
//            if (num >= 0) {
//                pos.add(num);
//            } else {
//                neg.add(num);
//            }
//        }
//
//
//        index=0;
//        int i=0,j=0;
//        while (i<pos.size() && j<neg.size()){
//            nums[index++]=pos.get(i++);
//            nums[index++]=neg.get(j++);
//        }
//        while (i<pos.size()){
//            nums[index++]=pos.get(i++);
//        }
//        while (j<neg.size()){
//            nums[index++]=neg.get(j++);
//        }
//
//
//        return nums;

        //



//        int n=nums.length;
//        int[] pos=new int[n/2];
//        int[] neg=new int[n/2];
//        int pi=0,ni=0;
//
//        for(int num:nums){
//            if(num>=0)pos[pi++]=num;
//            else neg[ni++]=num;
//        }
//        pi=0;
//        ni=0;
//
//        for(int i=0;i<nums.length;i++){
//            if(i%2==0)nums[i]=pos[pi++];
//            else nums[i]=neg[ni++];
//        }
//
//        return nums;


        //

        //positive, negative, positive, negative, positive.......
        //p,n,p,n,p.....
        //p every second index from start
        //n every second index from index 1
        int p=0,n=1;
        int[] x=new int[nums.length];
        for(int num:nums){
            if(num>=0){
                x[p]=num;
                p+=2;
            }else{
                x[n]=num;
                n+=2;
            }
        }
        return x;


    }

}
