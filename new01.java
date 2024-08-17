import java.util.Scanner;
public class new01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("hello user");
//        System.out.print("Please enter your salary : ");
//        float sal= input.nextFloat();
//        if (sal>1000){
//            System.out.println("tax 25%");
//
//        }else if(sal>0 && sal<1000) {
//            System.out.println("tax 15%");
//        }
//        else
//            System.out.println("enter a valid number.");
        int num=0;
        for(int i=0;i<5;i++){
            num++;
            System.out.print(num);
        }

        System.out.println();

        char ch=input.next().trim().charAt(0);
        if(ch >='a' && ch <='z' ){
            System.out.println("lower case");
        }else if(ch >='A' && ch <='Z'){
            System.out.println("upper case");
        }
   }
}
