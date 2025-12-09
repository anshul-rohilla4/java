public class LC4MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,3,4};
        int[] nums2={1,5,6};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0)return 0 ;
        int l1=0;
        int l2=0;
        int idx=0;
        int[] res=new int[nums1.length+nums2.length];
        while(l1<nums1.length && l2<nums2.length){
            if(nums1[l1]<=nums2[l2]){
                res[idx++]=nums1[l1++];
            }else res[idx++]=nums2[l2++];
        }
        while(l1<nums1.length){
            res[idx++]=nums1[l1++];
        }
        while(l2<nums2.length){
            res[idx++]=nums2[l2++];
        }

        int i=0;
        while(i<res.length){
            System.out.print(res[i]+" ");
            i++;
        }
        System.out.println();

        if(res.length==1)return res[0];

        if(res.length % 2 == 0) return (res[(res.length/2)-1]+res[res.length/2])/2.0;

        else return res[res.length/2];
    }
}
