import java.lang.reflect.Array;
import java.util.Arrays;

public class goodFarmLand {
    public static void main(String[] args) {
        int[][] land={
                {1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1},
                {1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1},
                {1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1},
                {0,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1},
                {0,1,1,0,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1},
                {1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1},
                {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1},
                {1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0},
                {1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1},
                {1,0,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1},
                {0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0},
                {1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1}
        };


        System.out.println(goodLand(land));

        System.out.println(good(land));
    }
//    public static long goodLand(int[][] nums){
//
//        int m=nums.length;
//        int n=nums[0].length;
//        System.out.println("m:"+m);
//        System.out.println("n: "+n);
//
//        int[][] dp=new int[m][n];
//
//        int maxSide=0;
//
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(nums[i][j]==1){
//                    if(i==0 || j==0){
//                        dp[i][j]=1; //for edges the square sides cant be changed
//                    }
//                    else{
//                        dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
//                    }
//                    maxSide=Math.max(maxSide,dp[i][j]);
//                    }
//            }
//        }
//        return (long)maxSide*maxSide;
//    }


    public static long goodLand(int[][] land){

        int m=land.length;
        int n=land[0].length;

        int[][] area=new int[m][n];
        int maxSide=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(land[i][j]==1){
                    if(i==0 || j==0){
                        area[i][j]=1;
                    }
                    else{
                        area[i][j]=Math.min(Math.min(area[i-1][j],area[i][j-1]),area[i-1][j-1])+1;
                    }
                    maxSide=Math.max(maxSide,area[i][j]);
                }

            }
        }

        return (long)maxSide*maxSide;
    }


    public static long good(int[][] nums){

        int m=nums.length;
        int n=nums[0].length;

        int[][] area=new int[m][n];

        int maxSide=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums[i][j]==1){
                    if(i==0 || j== 0) area[i][j]=1;
                    else{
                        area[i][j]=Math.min(Math.min(area[i-1][j],area[i][j-1]),area[i-1][j-1])+1;
                    }
                    maxSide=Math.max(maxSide,area[i][j]);
                }
            }
        }
//        for(int i=0;i<area.length;i++){
//            System.out.println(Arrays.toString(area[i]));
//
//        }
        return(long) maxSide*maxSide;
    }
}
