public class binarySearch{
    public static void main(String[] args){
        int[] arr={1,4,7,9,11,14,17,19,40,70,100};
        System.out.println(Binary(arr,40));
    }
    public static int Binary(int[] arr ,int k){
        int size= arr.length-1;

        int L=0;
        int R= size;

        while(R>=L){
            int M=L+(R-L)/2;
            if(arr[M]==k){
                return M;
            }
            if(arr[M]>k){
                R=M-1;
            }
            if(arr[M]<k){
                L=M+1;
            }
        }
        return -1;
    }
}