import java.util.Scanner;

public class checkOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the long number");
        long  longnum = input.nextLong();

        System.out.println("Enter the number to be counted");
        int num = input.nextInt();

        int count = countDigitOccurence(longnum, num);
        System.out.println("The number of occurences of "+num+ " are "+ count);
    }


    public static int countDigitOccurence(long longnum, int num) {
        int count = 0;
        while(longnum>0){
            long rem = longnum % 10;
            if(rem==num){
                count++;
            }
            longnum/=10;

        }
        return count;
    }
}

