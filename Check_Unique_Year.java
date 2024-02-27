import java.util.Scanner;
public class Check_Unique_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =  in.nextInt();

        String s = String.valueOf(n);

        int ans = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    ans++;
                    break;
                }
            }            
        }

        

        if(ans == 0){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
    

}

// 2013<=n && n<=2019