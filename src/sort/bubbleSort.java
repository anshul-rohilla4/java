package sort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={7,6,1,0};
        int[] result=sort(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    public static int[] sort(int[] arr){
        //Time Complexity: O(n2)
        //Auxiliary Space: O(1)

        
        for(int i=0 ; i<arr.length-1 ; i++){
            boolean swap=false;
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    //arr[j]<arr[j+1] for descending order
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)break;

        }
        return arr;
    }
}
