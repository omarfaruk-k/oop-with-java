import java.util.Scanner;

public class CheckUniqueYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =  in.nextInt();

        if(2013<=n && n<=2019){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
    
}
