import java.util.Scanner;

public class heap_sort {
    public void sort(int[] arr)
    {
        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
    void heapify(int [] arr,int N ,int i) {
        int largest = i;   //largest no as root node
        int l = 2 * i + 1;      //for left node
        int r = 2 * i + 2;      //for right node

        if
        (l < N && arr[l] > arr[largest])
            largest = l;
        if
        (r < N && arr[r] > arr[largest])
            largest = r;
        if
        (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;


                heapify(arr, N, largest);
            }
    }
    static void displayarray(int[] arr){
        //
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int N = sc.nextInt();       //Arr length
        int[] arr= new int[N];
        System.out.print("\narr[]: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        heap_sort obj = new heap_sort();
        obj.sort(arr);

        System.out.println("Sorted array is");
        displayarray(arr);
    }
}
