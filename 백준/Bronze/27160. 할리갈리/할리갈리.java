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
                new HashMap<>(Map.of("STRAWBERRY", 0, "BANANA", 0, "LIME", 0 ,"PLUM", 0));

        int count = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String fruit = st.nextToken();

            int num = Integer.parseInt(st.nextToken());
            cards.put(fruit, cards.get(fruit) + num);
        }

        if(cards.containsValue(5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        br.close();
    }
}