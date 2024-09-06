import java.util.Arrays;
//space complexity=O(1);
//no creation of extra arrays

public class arrangeListOddNumsAfterEvenNums2 {
    public static void main(String[] args) {
        int[] arr={7,6,0,3,9,4,1};

        System.out.println(Arrays.toString(resultListOddAfterEven2(arr,7)));
    }
    static int[] resultListOddAfterEven2(int[] array, int n){
        int i=0;int j=0;
        while (i<n-1 && j<n-1){
            if(array[i]%2==0){
                i++;
            }
            if(array[j]%2!=0){
                j++;
            }
            swap(array,i,j);
        }
        return array;
    }
    static void swap( int[] array,int n,int m){
        int temp=array[n];
        array[n]=array[m];
        array[m]=temp;
    }
}
