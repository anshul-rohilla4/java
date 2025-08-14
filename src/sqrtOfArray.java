public class sqrtOfArray {
    public static void main(String[] args) {
        int[] arr ={2,3,6,25,1,44,64,9,81};
        System.out.println(Sqrt(arr));

    }
    public static int Sqrt(int[] arr){
        int count=0;//numbers whose pure square root is possible
        for(int i :arr){
            int sqrt=(int)Math.sqrt(i);
            if(sqrt*sqrt==i){
                count++;
            }
        }
        return count;
    }
}
