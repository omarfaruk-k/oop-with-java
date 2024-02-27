import java.util.Scanner;

public class cnt2 {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    int cnt1=0,cnt2=0,cnt3 = 0;


    while(n>0){

        int a = scan.nextInt();

        if(a==1) cnt1++;
        else if(a==2) cnt2++;
        else if(a==3) cnt3++;
        
        n--;

    }

    if(cnt1>cnt2 && cnt1>cnt3) System.out.println("Google Classroom");
    else if(cnt2>cnt1 && cnt2>cnt3) System.out.println("WhatsApp");
    else if(cnt3>cnt1 && cnt3>cnt2) System.out.println("Telegram");
    else System.out.println("TIE");

   
}
}
