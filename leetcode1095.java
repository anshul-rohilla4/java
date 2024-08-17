public class leetcode1095 {
    public static void main(String[] args) {
        //1095. Find in Mountain Array
        int[] array={11,21,29,38,39,40,47,49,50,54,57,60,61,69,78,81,83,92,102,104,109,114,123,132,135,143,144,153,163,166,167,175,173,165,155,145,136,126,118,110,104,103,100,92,87,77,71,65,62,59,57,52,49,41,40,34,30,28,24,15,7,0};
        int answer=findInMountainArray(array,92);
        System.out.println(answer);


    }
    static int findInMountainArray(int[] array, int target) {
        int peak =peakIndexInMountainArray(array);
        //finds the peak index of the array.
        int leftS=binarySearch(array,0,peak,target);
        //apply Bsearch in left part as the priority is to find the least index of the target.
        if(leftS!=-1){
            //if found returns the value.
            return leftS;//answer!!
        }else {
            //if not in the left part of the index search in right part
            int rightS=OrderAgnosticBSearch(array,peak+1,array.length-1,target);
            //right of the index in the descending order
            return rightS;//answer!!
            //if not found returns -1 as rightS value is -1 in the function.
        }

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                index = mid;
                break;
            } else if (arr[mid] < arr[mid + 1] || arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1] || arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }
        }return index;

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

    static int OrderAgnosticBSearch(int[] array,int start,int end,int key){
        //if array in descending order.
        int mid=0;
        while(start<=end) {
            mid=start+(end-start)/2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return -1;

    }
}
