public class leetcode744 {
    //744. Find Smallest Letter Greater Than Target
    public static void main(String[] args) {
        char[] letters={'x','x','y','y'};
        char val=nextGreatestLetter(letters,'z');
        System.out.println(val);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;

            if(letters[mid]==target){
                return letters[mid+1];
            }else if( letters[mid]>target){
                end=mid-1;
            }else
                start=mid+1;
        }
        return letters[start %letters.length];//?????

    }
}
