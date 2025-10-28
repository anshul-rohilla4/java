public class LC2125NumberOfLaserBeamsInABank {

    public static void main(String[] args) {
        String[] bank={"011001","000000","010100","001000"};

        System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {

        int totalLines=0;

        int prevCount=0;
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[0].length();j++){
                if(bank[i].charAt(j)=='1') {
                    count++;

                }
            }
            System.out.println("i: "+i+" count: "+count);

            totalLines=totalLines+(count*prevCount);


            if(count==0)continue; //no 1's in current row

            prevCount=count;
        }
        return totalLines;
    }
}
