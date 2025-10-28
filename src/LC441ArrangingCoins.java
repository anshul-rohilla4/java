public class LC441ArrangingCoins {
    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));
    }
//    public static int arrangeCoins(int n) { //bruteforce
//        int l=0,extra=0;;
//        while(l<=n){
//            n-=l;
//            if(n<0)return l;
//            l++;
//        }
//    return  l-1;
//    }

    public static int arrangeCoins(int n) {
        long left=1,right=n;
        while(left<=right){
            long mid=left+(right-left)/2;

            long coins=(mid*(mid+1))/2; //coins needed to fill full rows

            if(coins==n) return (int)mid;
            if(coins<n) left=mid+1;
            else right=mid-1;
        }

        return (int) right;
    }
}
