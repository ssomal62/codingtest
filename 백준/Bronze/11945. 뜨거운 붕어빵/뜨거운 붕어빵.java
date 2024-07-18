import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());

        int readCount = 1;

        while (readCount <= n) {
            String line = br.readLine().trim();
            String reversedLine = new StringBuilder(line).reverse().toString();
            sb.append(reversedLine + "\n");
            readCount++;
        }

        System.out.println(sb.toString());
        br.close();
    }
}
