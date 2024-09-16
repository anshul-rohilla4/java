import java.util.*;

public class infiniteArray {
    //an array for which we dont know the size or cant take the size (not to use array.length)
    public static void main(String[] args) {
        int[] nums={1,3,4,6,7,9,12,500,4848,4849,5120,6161,71651,96511};
        int ans=findTarget(nums,71651);
        System.out.println(ans);


    }

    static int findTarget(int[] array,int key){
        int start=0;
        int end=1;
        while (array[end] < key) {
            int temp= end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(array,start,end,key);
    }

    static int binarySearch(int[] array,int start,int end,int key){
        int mid=0;
        while(start<=end) {
            mid=start+(end-start)/2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return -1;

    }

}
