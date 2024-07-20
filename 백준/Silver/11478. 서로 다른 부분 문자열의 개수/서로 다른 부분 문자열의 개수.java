import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        String str = br.readLine();

        int s = 0;
        int e = 1;

        int max = str.length();

        while (s < max) {

            set.add(str.substring(s, e));

            if(e <= max) {
                e++;
            }
            if(e == max + 1) {
                s++;
                e = s + 1;
            }
        }
        System.out.println(set.size());
        br.close();
    }
}