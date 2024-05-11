import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class prac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        
        for(int i =0; i<n;i++){
            int a = sc.nextInt();
            l.add(a);
        }

        int t = sc.nextInt();
        
        while (t>0) {
            String s = sc.next();
            if(s.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(x,y);
            }
            else if(s.equals("Delete")){
                int x = sc.nextInt();
                l.remove(x);
            }
            
            t--;
        }

        for(int i:l){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        

    }
 
}





static long fib(int n)
{
    if(n==0)
    {
        return 0;
    }

    else if(n==1)
    {
        return 1;
    }

    else
    {
        return fib(n-1)+fib(n-2);
    }
}

public static void main(String[] args) {
    Scanner sc=new scanner(System.in);

    int n=sc.nextInt();

    long result= fib(n);

    System.out.println(result);
}