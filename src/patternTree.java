import java.security.spec.RSAOtherPrimeInfo;

public class patternTree {
    public static void main(String[] args) {
        int num = 21;
        int number=1;
        int counter =1;
        while(number<=num){
            for( int i=1;i<=counter;i++){
                if(number<=num){
                System.out.print(number + " ");
                number++;
                }
                else return;
            }
            counter++;
            System.out.println();
        }
    }
}

//1
//2 3
//4 5 6
//7 8 9 10
