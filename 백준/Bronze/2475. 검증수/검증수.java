import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int sum = 0;

        while (st.hasMoreTokens()) {
            int token = Integer.parseInt(st.nextToken());
            sum += (int) Math.pow(token,2);
        }

        String result = String.valueOf(sum % 10);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}