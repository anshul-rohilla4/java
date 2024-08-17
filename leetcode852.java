public class leetcode852 {
    //Return the index of the peak element.
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,2,0};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);

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
}
