import java.util.Scanner;

public class minima_maxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("arr[]= ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println("maxima= "+max);
        System.out.println("minima="+min);
    }
}
