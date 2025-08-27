public class shlQ2_StringIntSum {
    public static void main(String[] args) {
        String orders="11 134 34345 23532";
        // the index represent the  order id and the sum of the digits represent the total order cost;
        // return a string with all individual orders cost;
        String result=orderCost(orders);
        System.out.println(result);

    }
    static String orderCost(String orders){
        if(orders==null)return null;

        int sum=0;
        String result="";
            for(int i=0 ;i<orders.length() ;i++){

                if(orders.charAt(i)==' '){
                    result+=sum+" ";
                    sum=0;
                    continue;
                }
                else {
                    sum += orders.charAt(i)-'0';
                }
            }
        result+=sum;
        return result;
    }

}
