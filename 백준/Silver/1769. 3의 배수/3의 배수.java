import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        int len = num.length();
        int count = 0;

        while (len != 1) {
            count++;
            long result = num.chars().mapToLong(c-> Character.getNumericValue(c)).sum();

            num = String.valueOf(result);
            len = num.length();
        }

        System.out.println(count + "\n" + (Integer.parseInt(num) % 3 == 0 ? "YES" : "NO"));

        br.close();
    }
}
