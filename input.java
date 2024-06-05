import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        while (n > 0) {
            n--;
            String s = sc.nextLine();
            if (s.charAt(0) == 'E') {
                System.out.println("Locker");
            } else if (s.charAt(0) == 'I') {
                System.out.println("Mukesh Ambani");
            } else if (s.charAt(0) == 'P') {
                System.out.println("Human");
            } else if (s.charAt(0) == 'A') {
                System.out.println("ATM Booth");
            }
        }
    }
}
