import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        for(int i = 0; i<n;i++){

            int k=0;

            for(int j =0; j<n-i;j++){
                System.out.print(" ");
            }

            while(k!=(2*i)-1){
                System.out.print("*");

                k++;

            }

            System.out.print("\n");

        }
    }
}
