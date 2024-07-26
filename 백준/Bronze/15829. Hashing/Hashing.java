

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int LEN = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        int sum = 0;

        for(int i = 0 ; i < LEN; i++) {
            sum += (chars[i] - 96)  * (int)Math.pow(31, i);
        }

        System.out.println(sum);

        br.close();
    }
}
