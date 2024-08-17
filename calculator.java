import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("this is a calculator");

        System.out.println("enter the operand");
        char operand=input.next().trim().charAt(0);
        System.out.println("enter first number");
        int num1= input.nextInt();
        System.out.println("enter second number");
        int num2= input.nextInt();
        int answer =0 ;

        switch (operand) { //alt+enter on general switch statement.
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> answer = num1 / num2;
            default -> System.out.println("enter the valid operand");
        }

        System.out.println("answer is "+ answer);


//        int day =input.nextInt();
//        switch (day){
//            case 1,2,3,4,5 -> System.out.println("Weekday");
//            case 6,7 -> System.out.println("Weekend");
        }
    }

