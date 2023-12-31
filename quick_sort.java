
public class quick_sort {
    //swapping
    static void swap(int i , int j, int[] arr ){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[] arr, int low , int high){
        int pivot=arr[high];       //pivot
        int i = low-1;
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)     //checks and swaps if smaller than pivot
            {
                i++;
                swap( i, j,arr);
            }
        }
        swap(i+1,high,arr);
        return(i+1);
    }
    static void quicksort(int[] arr,int low,int high){
        if (low<high){
            int pi =partition(arr,low ,high);

            quicksort(arr,low,pi-1);        //sorts element before partition and after
            quicksort(arr,pi+1,high);
        }
    }
    static void display(int[] arr, int n ){
        for (int i = 0; i<n;i++){
            System.out.println(arr[i]+"  ");
        }
    }


    public static void main(String[] args) {

        int[] arr={12,34,5,2,6,3,45,10};
        int n=arr.length;
        quicksort(arr,0,n-1);
        display(arr,n);
    }
}
