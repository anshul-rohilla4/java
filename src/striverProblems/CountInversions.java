package striverProblems;

import java.util.Arrays;

public class CountInversions {
    //https://takeuforward.org/plus/dsa/problems/count-inversions
    public static void main(String[] args) {
        int[] nums={2, 3, 7, 1, 3, 5};
        System.out.println(numberOfInversions(nums));
        //Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

    }

    //brute-fore
//    public static long numberOfInversions(int[] nums) {
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if(i<j && nums[i]>nums[j])count++;
//            }
//        }
//        return count;
//    }

    //merge-sort approach
    public static long numberOfInversions(int[] nums) {
        return  sortNums(nums,0, nums.length-1);

    }
    public static int sortNums(int[] nums, int left, int right){
        if(left<right){
            int mid=left+(right-left)/2;

            int leftCount=sortNums(nums,left,mid);
            int rightCount=sortNums(nums,mid+1,right);

            int mergeCount=mergeNums(nums,left,mid,right);
            return leftCount+rightCount+mergeCount;
        }
        return 0;

    }
    public static int mergeNums(int[] nums, int left, int mid, int right){
        int l1=mid-left+1;
        int l2=right-mid;

        int[] L1=new int[l1];
        int[] L2=new int[l2];
        for(int i=0;i<l1;i++){
            L1[i]=nums[left+i];
        }
        for(int i=0;i<l2;i++){
            L2[i]=nums[mid+1+i];
        }
        int i=0,j=0,k=left;

        int count=0;
        while(i<l1 && j<l2){
            if(L1[i]<=L2[j]){
                i++;
//                nums[k++]=L1[i++];
            }else {
//                nums[k++]=L2[j++];
                j++;
                count+=(l1-i);
            }

        }

//        while (i < l1) nums[k++] = L1[i++];
//        while (j < l2) nums[k++] = L2[j++];

        return count;

    }



}