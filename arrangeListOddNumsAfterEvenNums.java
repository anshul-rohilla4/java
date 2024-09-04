import java.util.*;
public class arrangeListOddNumsAfterEvenNums {
    //create two empty array ie. even and odd.
    //store all elements in the even and odd array respectively.
    // add the even and odd array into int[] result array.
    //returns result.
    public static void main(String[] args){

        int[] arr={11,10,2};
        System.out.println(Arrays.toString(resultListOddAfterEven(3,arr)));

    }
    static int[] resultListOddAfterEven(int n,int[] array){
        int[] even=new int[n];
        int[] odd=new int[n];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(array[i]%2==0) {
                even[e] = array[i];
                e++;
            }
            else{
                odd[o]=array[i];
                o++;
            }
        }
        int pos=0;
        int[] result=new int[e+o];
        for( int i=0;i<e;i++){
            result[pos]=even[i];
            pos++;
        }
        for(int i=0;i<o;i++){
            result[pos]=odd[i];
            pos++;
        }
        return result;
    }
}
