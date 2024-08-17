public class cielingOfNumber {
    // CIEL smallest number  in an array equal to or greater than the target element.
    //FLOOR greatest number smaller or equal to the target

    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,19};
        int val=cielOfNumber(arr,6);
        //if n is present in the array ,return index(n) else smallest greater number than the target.
        System.out.println(val);
    }

    static int cielOfNumber(int[] arr,int n){

            int start=0;
            int last =arr.length-1;
            int mid=0;
            while(start<=last){
                mid=start+(last-start)/2;
                if(arr[mid]==n){
                    return mid;
                } else if (arr[mid]<n) {
                    start=mid+1;
                }else if (arr[mid]>n) {
                    last = mid - 1;
                }

            }
        if(last<n){
            return last+1;
        }
        return mid;
    }
}
