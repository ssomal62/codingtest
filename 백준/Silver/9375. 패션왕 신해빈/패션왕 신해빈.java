
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Map<String, Integer> closet = new HashMap<>();

        final int MAX = Integer.parseInt(br.readLine());

        for(int i = 0; i < MAX; i++) {
            int count = Integer.parseInt(br.readLine());

            for(int j = 0; j < count; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                closet.merge(st.nextToken(), 1, Integer::sum);
            }

            int result = 1;

            for(Map.Entry<String,Integer> entry: closet.entrySet()) {
                result *= (entry.getValue() + 1);
            }

            sb.append(result - 1 + "\n");
            closet.clear();
        }

        System.out.println(sb.toString());

        br.close();
    }
}
