package sort;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={4,6,1,2};
        int[] result=sort(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    public static int[] sort(int[] arr){
        //Time Complexity
        //Best case: O(n), If the list is already sorted, where n is the number of elements in the list.
        //Average case: O(n2), If the list is randomly ordered
        //Worst case: O(n2), If the list is in reverse order

        //Space Complexity : O(1)

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }


        return arr;
    }

}
