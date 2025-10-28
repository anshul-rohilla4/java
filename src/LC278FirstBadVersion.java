public class LC278FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(3,2));
    }
    public static int firstBadVersion(int n,int isBadVersion) {
        if(n==1){
            return 1;
        }
        int low=1,high=n; //as the versions start from 1 index till n
        int bad=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

//            if(!isBadVersion(mid))low=mid+1;
            if(mid!=isBadVersion)low=mid+1;
            else {
                high = mid - 1;
                bad = mid;
            }

        }
        return bad;
    }
}

