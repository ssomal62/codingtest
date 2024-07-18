import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine().trim());
        
        for (int i = 1; i <= num; i++) {
            sb.append("*".repeat(i))
                    .append(" ".repeat(num * 2 - i * 2))
                    .append("*".repeat(i))
                    .append("\n");
        }

        for (int i = num - 1; i >= 1; i--) {
            sb.append("*".repeat(i))
                    .append(" ".repeat(num * 2 - i * 2))
                    .append("*".repeat(i))
                    .append("\n");
        }

        System.out.println(sb.toString());

        br.close();
    }
}