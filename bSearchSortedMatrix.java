import java.util.Arrays;

//selects the  row and then performs the binary search in the specific row.

public class bSearchSortedMatrix {
    public static void main(String[] args){
        int[][]matrixx={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.toString(search(matrixx,4)));
    }
    static  int[]search(int[][] arr,int target){
        int row=0;
        int col=arr[row].length-1;
        while(row < arr.length && col>=0 && col<=arr[row].length-1){
            if(arr[row][col]==target){
                return new int[] {row,col};
            }
            else if(arr[row][col]<target){
                row++;
            }else
                col--;
        }
        int start=0;
        int end=arr[row].length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if (arr[row][mid] == target) {
                return new int[] {row,mid};
            } else if (arr[row][mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return new int[] {-1,-1};
    }
}
