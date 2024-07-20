import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int count = 0;
        String result = "";

        while (!(str.isEmpty())) {
            int len = str.length();

            String f = String.valueOf(str.charAt(0));

            str = str.replace(f, "");

            if(count == len - str.length()) {
                result = "?";
            }

            if(count < len - str.length()) {
                count = len - str.length();
                result = f;
            }
        }

        System.out.println(result);
        br.close();
    }
}