import java.util.Scanner;

public class linear_search {
    public static int search(int[] arr, int a){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i]==a){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("arr[]= ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("a= ");
        int a = sc.nextInt();
        int result = search(arr,a);
        if(result==-1){
            System.out.println("No entered is not present.");
        }
        else{
            System.out.println("No entered is at index "+result);
        }
    }
}