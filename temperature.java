import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.println("enter the temp in C°. ");
        Scanner input =new Scanner(System.in);
        float temp1= input.nextFloat();

        float temp2=( ((9/5) * temp1) + 32);
        System.out.println("temp in Fahr is "+ temp2+ "F°");
    }
}

