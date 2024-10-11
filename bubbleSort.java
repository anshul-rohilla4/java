import java.sql.Array;
import java.util.Arrays;

public class bubbleSort {
    /*
    aka sinking sort or exchange sort;
    compare adjacent elements;
    there are to be n-1 passes;
    at the end of every pass,largest element is positioned at the last index;
    at the end of every pass do n--, cause the largest element is already at its final position at every pass;
    is a stable sorting algo;
    space complexity O(1);  //no new array created;


     */
    public static void main(String[] arg){
        int[] arr={1,2,3,88,2};
        System.out.println(Arrays.toString(bubble(arr)));


    }
    static int[] bubble(int[] array){

        for(int i=0;i<array.length;i++){
            boolean swapped =false;
            for(int j=1;j<array.length-i;j++){
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                    swapped=true; //if there is a swap ,hence the array might not be at its final position. ie. not fully sorted
                }
            }
            if(!swapped){ //if no swap has taken place,it means the array is already sorted;
                return array;
            }
        }
        return array;
    }
    static void swap( int[] array,int n,int m){
        int temp=array[n];
        array[n]=array[m];
        array[m]=temp;
    }
}
