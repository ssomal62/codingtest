import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int countR = 1;
    int countD = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Main sol = new Main();
        sol.fib_recursive(n);
        sol.fib_dynamic(n);

        System.out.print(sol.countR + "\n" + sol.countD +"\n");

        br.close();
    }

    public int fib_recursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            countR++;
            return fib_recursive(n - 1) + fib_recursive(n - 2);
        }
    }

    public int fib_dynamic(int n) {
        if (n <= 1) return n;

        int[] fib = new int[n + 1];
        fib[1] = 1;
        fib[2] = fib[1];

        for(int i = 3; i <= n; i++) {
            countD++;
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}