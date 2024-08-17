
public class leetcode1672 {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int val = maximumWealth(accounts);
        System.out.println(val);
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth =0;
        int sumF=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>=sumF){
                sumF=sum;
            }
        }
        return sumF;

    }
}
