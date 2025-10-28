
import java.util.Arrays;

public class primePrintProblem {

    //given an array of ints, look for prime numbers.
    //count the number of prime in the array
    //  if count is even, print in ascending order, else descending order

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,3,5,64,734,6,52,33,4,546,8,9};

        System.out.println(Arrays.toString(numbers(nums)));

    }

    public static int[] numbers(int[] nums){

        int[] prime=new int[nums.length];
        int count=0;
        for (int num : nums) {
            if (isPrime(num)) {
                prime[count] = num;
                count++;
            }
        }
        if(count%2==0) {
            Arrays.sort(prime,0,count);

            return Arrays.copyOf(prime,count);
        }
        Arrays.sort(prime, 0, count);
        for (int i = 0; i < count / 2; i++) {
            int temp = prime[i];
            prime[i] = prime[count - 1 - i];
            prime[count - 1 - i] = temp;
        }
        return Arrays.copyOf(prime,count);
    }

    public static boolean isPrime(int num){
        if(num<2)return false;
        if(num<4)return true;
        int i=2;
        while((i*i)<=num){
            if(num%i==0)return false;
            i++;
        }
        return true;
    }


}
