import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        boolean result = f(a1, a0, n, c);

        System.out.println(result ? 1 : 0);

        sc.close();
    }
    static boolean f(int a1, int a0, int n, int c) {
        if (a1 * n <= c * n) {
            int f = a1 * n + a0;
            return f <= n * c;
        }
        return false;
    }
}