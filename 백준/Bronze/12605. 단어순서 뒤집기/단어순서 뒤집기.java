
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> str = new Stack<>();
        final int MAX = Integer.parseInt(br.readLine());

        for(int i = 1; i <= MAX; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            while (st.hasMoreTokens()) {
                str.push(st.nextToken());
            }

            sb.append("Case #" + i +":");

            while (!str.isEmpty()) {
                sb.append(" " + str.pop()) ;
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
