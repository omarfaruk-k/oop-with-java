import java.util.*;

public class Main {
    static int n, e;
    static int[][] graph;
    static int[] visit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        e = scanner.nextInt();
        
        graph = new int[1000][1000];
        visit = new int[1000];

        int u, v;
        for (int i = 1; i <= e; i++) {
            u = scanner.nextInt();
            v = scanner.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        dfs(1);

        scanner.close();
    }

    static void dfs(int s) {
        visit[s] = 1;
        System.out.print(s + " ");

        for (int i = 0; i <= n; i++) {
            if (visit[i] == 0 && graph[s][i] == 1) {
                dfs(i);
                visit[i] = 1;
            }
        }
    }
}
