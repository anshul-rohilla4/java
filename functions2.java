import java.util.Scanner;

public class functions2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=in.nextLine();
        String msg=greet(name);
        System.out.println(msg);

    }
    static String greet(String user){
        String message="Hello "+user;
        return message;
    }
}
