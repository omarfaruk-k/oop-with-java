import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        if (n<26) {
            System.out.println("NO");
        }
        else{
            s =s.toLowerCase();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            char ch = 'a';
            int cnt = 0;

            while (ch<='z') {
                for (int i = 0; i < arr.length; i++) {
                    if (ch == arr[i]) {
                        cnt++;
                        break;
                    }
                }
                ch++;
            }


            if(cnt>=26) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}