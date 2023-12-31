import java.util.Scanner;

public class binary_search {
    public static int binary(int[] arr, int a){

        int n = arr.length;
        int l=0;
        int h=n-1;

        for (int i=0; i<n ;i++){
            int mid =(l+h)/2;
            if (a< arr[mid]){
                h=mid-1;

            } else if (a > arr[mid]) {
                l=mid+1;

            }
            else {
                return  mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("arr[]= ");
        for (int i = 0; i < n ; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.print("a= ");
        int a= sc.nextInt();
        int result = binary(arr,a);
        if (result==-1){
            System.out.println("No not found");
        }
        else {
            System.out.println("Number is at index "+result);
        }
        Scanner s = new Scanner(System.in);
        String str;
        str = s.next();
        System.out.print(str);
    }
}