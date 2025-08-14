public class LC66PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        plusOne(digits);
    }
    public static int[] plusOne(int[] digits) {

        if(digits.length==1){
            if(digits[digits.length-1]==9){
                return new int[]{1,0};
            }
        }
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
        }
        else if (digits[digits.length-1]==9) {
            digits[digits.length-1]=0;
            int add=1;
            int index= digits.length-2;
            while(index>=0){
                if(digits[index]+add>9){
                    if(index!=0){
                        digits[index]=0;
                    }
                    else{
                        int[] result=new int[digits.length+1];
                        result[0]=1;
                        for (int i = 0; i < result.length; i++) {
                            System.out.print(result[i]);
                        }
                        System.out.println();
                        return result;
                    }
                }
                else {
                    digits[index]+=1;
                    break;
                }
                index--;
            }


        }
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        return digits;



    }
}
