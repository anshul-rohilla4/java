import java.util.Scanner;
public class reverseInt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the digits");
        long num=input.nextLong();

        long reverseNum =reverseNum(num);
        System.out.println("the reverse is " +reverseNum);
    }
    public static long reverseNum(long num){
        long reversenum = 0;
        while (num != 0) {
            long digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num /= 10;
        }
        return (reversenum);
    }
}

