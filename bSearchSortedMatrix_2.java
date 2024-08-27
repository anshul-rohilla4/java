import java.util.Arrays;
public class bSearchSortedMatrix_2 {
    public static void main(String[] args) {
        int[][] matrixx = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(search(matrixx, 102)));
    }


    static int[] search(int[][] arr, int target) {

        int rStart=0;
        int rEnd=arr.length-1;
        int cEnd=arr[0].length-1;
        int rMid=-1;
        while(rStart<=rEnd){
            rMid=rStart+(rEnd-rStart)/2;
            if(arr[rMid][cEnd]==target){
                return new int[]{rMid,cEnd};
            }
            else if(arr[rMid][cEnd]<target){
                rStart=rMid+1;

            }
            else
                rEnd=rMid-1;
        }
        int start=0;
        int end=arr[rMid].length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if (arr[rMid][mid] == target) {
                return new int[] {rMid,mid};
            } else if (arr[rMid][mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return new int[] {-1,-1};
    }
}
