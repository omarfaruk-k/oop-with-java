import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class cp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int big = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>big) {
                pos = i;
                big = arr[i];
            }
        }

        // Arrays.sort(arr);

        int a = arr[pos];

        int i = m;
        while (i>0) {
            i++;
            a = a/2;
        }

        arr[pos] = a;

        long sum = 0;
        for (int j : arr) {
            sum=sum+j;
        }

        System.out.println(sum);

    }

    
}
