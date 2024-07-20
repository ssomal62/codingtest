import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String, Integer> cards =
                new HashMap<>();

        int count = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < count; i++) {
            
            st = new StringTokenizer(br.readLine()," ");
            
            String fruit = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            cards.merge(fruit, num, Integer::sum);
        }

        System.out.println(cards.containsValue(5) ? "YES" : "NO");

        br.close();
    }
}