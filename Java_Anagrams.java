import java.util.Arrays;
import java.util.Scanner;

public class prac {

    static boolean isAnagram(String a, String b) {

        a=a.toLowerCase();
        b=b.toLowerCase();

        char[] aArr =a.toCharArray();
        char[] bArr = b.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);






       
        
        
        return Arrays.equals(aArr, bArr);



    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();
        
        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
 
}
