import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        sum();


    }
     static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first num");
        int num1=input.nextInt();
        System.out.println("enter the second num");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("sum is "+  sum);

    }
}
