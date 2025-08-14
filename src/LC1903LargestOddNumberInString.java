public class LC1903LargestOddNumberInString {
    public static void main(String[] args){
        String num = "246842";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {

        //find tha last odd number than return the subString from 0 to lastOddNum index;
        int index=-1;
        for(int i=0;i<num.length();i++){
            int Num=num.charAt(i)-'0';
            if(Num%2!=0){
                index=i;
            }
        }
        return num.substring(0,index+1);

//        int index=-1;
//        index=Math.max(num.lastIndexOf('1'),index);
//        index=Math.max(num.lastIndexOf('3'),index);
//        index=Math.max(num.lastIndexOf('5'),index);
//        index=Math.max(num.lastIndexOf('7'),index);
//        index=Math.max(num.lastIndexOf('9'),index);
//        return num.substring(0,index+1);
    }
}
