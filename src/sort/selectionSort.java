package sort;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={64, 25, 12, 22, 11};
        int[] result=sort(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    public static int[] sort(int[] arr){
        //Time complexity: O(N2), (where N = size of the array), for the best, worst, and average cases.
        //Space Complexity: O(1)

        //take the  min element and switch it with the first element.
        for(int i=0 ; i<arr.length ; i++){
            int min_idx=i; //i'th element
            for( int j=i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;//smallest than i element
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }


        return arr;
    }
}
