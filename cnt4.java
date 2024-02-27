import java.util.Scanner;

public class cnt4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];
    
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int m = scan.nextInt();

        int cnt = 0;

        //System.out.println(m);

        // for (int i : arr) {
        //     System.out.println(i);
        // }
        
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==m) {
                System.out.println(arr[i+1]);
                //cnt=1;
                break;
            }
        }

         if(cnt!=0) System.out.println(-1);


    }    
}
