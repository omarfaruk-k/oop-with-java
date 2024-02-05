import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String cheack= n%2==0 ?"Even" :"Odd";
        System.out.println(cheack);    
    }
}
