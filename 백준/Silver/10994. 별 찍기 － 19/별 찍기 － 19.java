import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine().trim());

        int max = 4 * (n - 1) + 1;
        int mid = max / 2 - 1;

        int midLen = max - 4;
        int sideRoof = 1;

        sb.append("*".repeat(max)).append("\n");

        for (int i = 0; i < max - 2; i++) {
            if(n == 1) return;

            if((i % 2 != 0) && i > mid) {
                sideRoof--;
                midLen += 4;
            }

            sb.append("* ".repeat(sideRoof));

            if (i % 2 == 0) {
                sb.append(" ".repeat(midLen));
            } else {
                sb.append("*".repeat(midLen));
            }

            sb.append(" *".repeat(sideRoof)).append("\n");

            if ((i % 2 != 0) && i < mid) {
                sideRoof++;
                midLen -= 4;
            }
        }

        if(n != 1) {
            sb.append("*".repeat(max)).append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }
}