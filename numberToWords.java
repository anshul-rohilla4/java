public class numberToWords {
    public static void main(String[] args){
        long n=36L;

        System.out.println(toWords(n));



    }
    static String toWords(long n){

        if (n==0){
            return ("Zero");
        }
        long limit=1000000000000L,current_num;
        int t=0;

        String multiplier[] ={
                "", "Trillion", "Billion",
                "Million", "Thousand"
        };

        String first_twenty[]={
                "",        "One",       "Two",      "Three",
                "Four",    "Five",      "Six",      "Seven",
                "Eight",   "Nine",      "Ten",      "Eleven",
                "Twelve",  "Thirteen",  "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String tens[]={
                "",        "Twenty", "Thirty",
                "Forty",   "Fifty",  "Sixty",
                "Seventy", "Eighty", "Ninety"
        };

        if(n<20L){
            return (first_twenty[(int)n]);
        }
        String answer="";

        for(long i=n; i>0; i%=limit, limit/=1000){
            current_num=i/limit;

            while(current_num==0){
                i%=limit;
                limit/=1000;
                current_num=i/limit;

                ++t;
            }


            if(current_num>99){
                answer+=(first_twenty[(int)current_num/100]="Hundred");
            }

            current_num=current_num%100;

            if(current_num>0 && current_num<20){
                answer+=(first_twenty[(int)current_num]+" ");
            }

            else if(current_num % 10 ==0 && current_num!=0){
                answer+=(tens[(int)current_num /10-1]+" ");
            }
            else if(current_num>20 && current_num <100){
                answer+=(tens[(int)current_num/10]+ " "+first_twenty[(int) current_num%10]+ " ");
            }
            if(t<4){
                answer+=(multiplier[(int)++t]+ " ");
            }

        }
        return(answer);




    }
}
