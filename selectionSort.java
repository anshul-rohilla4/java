import java.util.Arrays;

public class selectionSort {
    /*
    worst case=O(N^2);
    best case=O(N^2);
    works well for small arrays;
     */
    public static void main(String[] args){
        int[] arr={1,2,3,88,2};
        System.out.println(Arrays.toString(selection(arr)));

    }
    static int[] selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int maxIndex = getMaxIndex(array, 0, last);
            swap(array, maxIndex, last);

        }
        return array;
    }
         static int getMaxIndex(int[] arr,int start,int end){

            int maxIndex=start;
            int maxValue=arr[start];
            int currentIndex=start;
            for(int element :Arrays.copyOfRange(arr,start,end+1)){
                if(element >maxValue){
                    maxValue=element;
                    maxIndex=currentIndex;
                }
                currentIndex++;
            }
            return maxIndex;

        }

    static void swap( int[] array,int n,int m){
        int temp=array[n];
        array[n]=array[m];
        array[m]=temp;
    }
}
