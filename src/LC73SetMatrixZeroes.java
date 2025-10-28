import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC73SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(matrix);
        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
//    public static void setZeroes(int[][] mat) {
//        List<List<Integer>> zeros=new ArrayList<>();
//        for(int i=0;i<mat.length;i++){
//            for(int j=0;j<mat[0].length;j++){
//                if(mat[i][j]==0)zeros.add(Arrays.asList(i,j));
//            }
//        }
//        System.out.println(zeros);
//
//        for(List<Integer> pair:zeros){
//
//            //col
//            for(int i=0;i<mat.length;i++){
//                mat[i][pair.get(1)]=0;
//            }
//
//            //row
//            for(int i=0;i<mat[0].length;i++){
//                mat[pair.get(0)][i]=0;
//            }
//        }
//    }


    public static void setZeroes(int[][] mat){

        List<List<Integer>>zero= new ArrayList<>();

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    zero.add(Arrays.asList(i,j));
                }
            }
        }

        for(List<Integer> pair:zero) {
            //row
            for (int row = 0; row < mat[0].length; row++) {
                mat[pair.getFirst()][row] = 0;
            }

            //col
            for(int col=0;col<mat.length;col++){
                mat[col][pair.getLast()]=0;
            }
        }
    }


}

