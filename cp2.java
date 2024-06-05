import java.util.Scanner;

public class cp2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        while (n > 0) {
            n--;
            String s = sc.nextLine();
            if (s.charAt(0) == '1') {
                System.out.println(s);
            } 
        }
    }
}
