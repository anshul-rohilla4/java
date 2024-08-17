import java.lang.Math;

public class practice01 {
    public static void main(String[] args) {
        int num=50;
        switch (num){
            case 0: System.out.println("num is zeroo");
                break;
            case 40: System.out.println("num is 40");
                break;
            case 50: System.out.println("num is 50");
                break;

        }
        int max=10;
        int min=1;
        int random=(int)(Math.random()*(max-min+1)+min);
        System.out.println(random);

    }
}
