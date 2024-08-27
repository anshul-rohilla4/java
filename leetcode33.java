public class leetcode33 {
    //Search in Rotated Sorted Array

    public static void main(String[] args){
        int[] arr={3,5,1};
        System.out.println(search(arr,3));


    }

    static int search(int[] nums, int target) {
        int pivot=findPivot(nums);

        if(pivot==-1){
            return binarySearch(nums,0, nums.length-1, target);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarySearch(nums,0,pivot-1,target);
        }
        return binarySearch(nums,pivot+1,nums.length-1,target);

    }

    static int findPivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else
                start=mid+1;
        }return -1;
    }

    static int binarySearch(int[] array,int start,int end,int key){
        //if array in ascending order.
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

// second question-> if there are duplicate elements skips duplicates start++,end--;
