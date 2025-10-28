package sort;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={4,6,1,2};
        int[] result=sort(arr,0,arr.length-1);
        for(int i:result){
            System.out.print(i+" ");
        }
    }

    public  static int[] sort (int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;

            //sort both halves
            sort(arr,left,mid);
            sort(arr,mid+1,right);

            //merge both halves
            merge(arr,left,mid,right);
        }
        return arr;
    }

    public static void merge(int[] arr , int left,int mid, int right){
        int length1=mid-left+1;
        int length2=right-mid;

        //temp arrays
        int[] L=new int[length1];
        int[] R=new int[length2];

        //copy data to temp
        for (int i = 0; i < length1; i++) {
            L[i]=arr[left+i];
        }
        for (int j = 0; j < length2; j++) {
            R[j]=arr[mid+1+j];
        }

        //merge
        int i=0,j=0,k=left;

        while(i<length1 && j<length2){
            if (L[i] <= R[j]) {
                arr[k]=L[i];
                i++;
            }
            else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        //copy left elements
        while(i<length1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<length2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
}

