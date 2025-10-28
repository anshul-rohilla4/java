import java.util.Scanner;

public class primeNumbers {
    //given num, return a string wth all prime numbers upto num(inclusive)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // num is inclusive in result
        //int num=sc.nextInt();
        int num=2;
        String result=primeN(num);
        System.out.println(result);

    }
    static String primeN(int num){
        if(num<2) return "";

        String result="";


        for(int i=2;i<=num;i++){
            for(int j=2;j<=i;j++){
                if(i==j){
                    result+=i;
                    result+=" ";
                }
                if(i%j==0){
                    break;
                }
            }
        }

        return result;

    }
}
