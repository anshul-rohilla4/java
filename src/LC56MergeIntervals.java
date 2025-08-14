import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,2},{3,5}};

        int[][] result=merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        if(intervals.length==1) return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        //0,2    1,4   3,5

        int[] current=intervals[0];
        list.add(current);

        for(int[] interval:intervals){
            if(interval[0]<=current[1]){
                current[1]=Math.max(current[1],interval[1]);
            }else {
                current=interval;
                list.add(current);
            }
        }

        return list.toArray(new int[list.size()][]);


//        List<int[]> list=new ArrayList<>();
//        if(intervals.length==1){
//            return intervals;
//        }
//        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
//
//        for(int i=0;i<intervals.length-1;i++){
//            if(intervals[i][1]>=intervals[i+1][0] && intervals[i][0]<=intervals[i+1][0]){
//                list.add(new int[]{Math.min(intervals[i][0],intervals[i+1][0]),Math.max(intervals[i][1],intervals[i+1][1])});
//                i++;
//            }
//            else if(intervals[i][0]<=intervals[i+1][1] && intervals[i][0]>=intervals[i+1][0]){
//                list.add(new int[]{Math.min(intervals[i][0],intervals[i+1][0]),Math.max(intervals[i][1],intervals[i+1][1])});
//                i++;
//            }
//            else{
//                list.add(new int[]{intervals[i][0],intervals[i][1]});
//            }
//
//            if(i==intervals.length-2){
//                i++;
//                list.add(new int[]{intervals[i][0],intervals[i][1]});
//            }
//        }
//        return list.toArray(new int[list.size()][]);
    }
}
