import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prac {

    static boolean isAnagram(String a, String b) {

        a=a.toLowerCase();
        b=b.toLowerCase();

        char[] aArr =a.toCharArray();
        char[] bArr = b.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        boolean ans = true;

        for (int i = 0; i < bArr.length; i++) {
            if(aArr[i]!=bArr[i]){
                ans = false;
                break;
            }
        }




       
        
        
        return ans;



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
