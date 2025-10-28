package striverProblems;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheRepeatingAndMissingNumber {
    //https://takeuforward.org/plus/dsa/problems/find-the-repeating-and-missing-number
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        //nums has A, which appears twice, and B that is missing
        //output: give {A, B}
        //modification of the array not allowed
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums)));
    }
    // ^ = XOR operator
    // & = AND operator

    //using modified array ie. sorted nums
//    public static int[] findMissingRepeatingNumbers(int[] nums) {
//        int[] res=new int[2];
//        Arrays.sort(nums);
//        if(nums[0]!=1){ //1 is missing, B
//            res[1]=1;
//        }
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]!=nums[i-1]+1){
//                res[1]=nums[i-1]+1;
//                break;
//            }
//        }
//        if(nums[nums.length-1]!=nums.length)res[1]=nums.length;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==nums[i-1]){
//                res[0]= nums[i];
//                break;
//            }
//        }
//
//        return res;
//    }


    //using a temp array ie. a sorted copy of nums
//    public static int[] findMissingRepeatingNumbers(int[] nums) {
//        int[] temp=new int[nums.length];
//        int index=0;
//        while (index<nums.length){
//            temp[index]=nums[index];
//            index++;
//        }
//        Arrays.sort(temp);
//        int[] res=new int[2];
//        if(temp[0]!=1){ //1 is missing, B
//            res[1]=1;
//        }
//        for(int i=1;i<temp.length;i++){
//            if(temp[i]!=temp[i-1]+1){
//                res[1]=temp[i-1]+1;
//                break;
//            }
//        }
//        if(temp[temp.length-1]!=temp.length)res[1]=temp.length;
//        for(int i=1;i<temp.length;i++){
//            if(temp[i]==temp[i-1]){
//                res[0]= temp[i];
//                break;
//            }
//        }
//
//        return res;
//    }

    //XOR-based method
    // O(n) time
    // O(1) space
    public static int[] findMissingRepeatingNumbers(int[] nums) {

        int[] res=new int[2];


        int xorNums=0;
        for(int num:nums){
            xorNums^=num;
        }

        int xor=0;
        for(int i=1;i<=nums.length;i++){
            xor^=i;
        }
        int xorAll=xorNums^xor; // it is basically -> missing ^ repeating


        int setBit=xorAll & (-xorAll);
        //A set bit = position where missing and repeating differ.
        //pointing to “the first place where these two numbers disagree”).

        int x=0,y=0;
        //Group A: numbers where that bit is 1.
        //Group B: numbers where that bit is 0.
        for(int num:nums){
            if((num & setBit) !=0 ){
                x^=num;
            }else y^=num;
        }
        int index=1;
        while (index<=nums.length){
            if((index & setBit)!=0){
                x^=index;
            }else y^=index;
            index++;
        }

        for(int num :nums){
            if(num==x){
                res[0]=x;
                res[1]=y;
                return res;
            }
        }

        res[0]=y;
        res[1]=x;
        return res;
    }
}
