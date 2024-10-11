import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println("LINEAR SEARCH");
        Scanner input=new Scanner(System.in);
        int[] array={156,51,31,35,186,35,881,1,351,898,1,53,518,189,61,35,18,6};

//        linearS(1,array);
//        linearS(1,array);//using for-each
        linearS3(881,array,2,9);//to search between specific index





    }
//    static void linearS(int n,int[] arr ){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==n){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();
//    }
//
//    static void linearS2(int n,int[] arr ){
//        int i=0;
//        for(int element:arr){
//            if(element==n){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();
//    }
    static void linearS3(int n,int[] array,int start,int end){
        for(int i=start;i<=end;i++){
            if(array[i]==n){
                System.out.print(i+" ");
            }

        }System.out.println();

    }
}
