public class LC11ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int maxWater=0;
        while(left<=right){
            int water=Math.min(h[right],h[left]) * (right-left);
            if(water>maxWater)maxWater=water;
            if(h[left]<h[right]){
                left++;
            }else right--;
        }
        return maxWater;
    }
}

