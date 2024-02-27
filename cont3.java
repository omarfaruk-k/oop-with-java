import java.util.Arrays;
import java.util.Scanner;

public class cont3 {
    public static void main(String[] args) {
        
    
        
    Scanner scan = new Scanner(System.in);
    
    int t = scan.nextInt();

    while(t>0){
        int n = scan.nextInt();

        int[] arr = new int[n];
    
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }
    
        Arrays.sort(arr);
    
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" ");
            System.out.print(arr[i]);
        }

        System.out.println();
        t--;
    }
    


    
    }
       
}
