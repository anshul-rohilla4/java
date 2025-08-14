public class LC485_Max_Consecutive_Ones {
        public static void main(String[] args) {

            int[] nums ={1,1,0,1,1,1};

            int[] counts=new int[nums.length];

            int index=0;
            int count=0;
            for(int i:nums){

                if(i==1){
                    count++;
                }
                counts[index]=count;
                if(i!=1){
                    index++;
                    count=0;
                }
            }
            int max=-1;
            for(int i:counts){
                if(i>=max){
                    max=i;
                }
            }
            System.out.println(max);

        }
    }