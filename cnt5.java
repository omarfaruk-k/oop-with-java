import java.util.Scanner;

public class cnt5 {

    static boolean binarySearch(int[] arr, int a) {
        int left = 0;
        int right = arr.length - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (arr[mid] == a)
                return true;
    
            if (arr[mid] < a)
                left = mid + 1;
            else
                right = mid - 1;
        }
    
        return false;
    }
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];
    
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }



        int t =scan.nextInt();

        

        while (t>0) {
            int a = scan.nextInt();

            boolean f = binarySearch(arr, a);

            if(f) System.out.println("YES");
            else System.out.println("NO");

            t--;
        }
    }
}
