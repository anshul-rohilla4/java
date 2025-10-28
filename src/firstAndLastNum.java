import java.util.ArrayList;
import java.util.Arrays;

public class firstAndLastNum {
    public static void main(String[] args) {
        int[] arr={};
        int n=arr.length;
        int k=6;
        int[] result=sol(arr,n,k);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sol(int[] arr,int n ,int k){

        if(n==0) return new int[]{-1,-1};

        int[] res=new int[]{-1,-1};

        int low=0;
        int high=n-1;


        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                res[0]=mid;
                high=mid-1;
            }
            else if (arr[mid]>k) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

        low=res[0];
        high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==k){
                res[1]=mid;
                low=mid+1;
            }
            else if (arr[mid]>k) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }



        return res;
    }
}
