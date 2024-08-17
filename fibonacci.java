import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num=input.nextInt();
        input.close();

        int arr[];
        arr=new int[num+1];
        arr[0]= 0;
        arr[1]= 1;

            int i=2;
            while (i <= num) {
                arr[i] = arr[i - 1] + arr[i - 2];
                i++;
            }
        System.out.println(arr[num-1]+" is at index "+ num + " of the series.");
    }
}
//0 1 1 2 3 5