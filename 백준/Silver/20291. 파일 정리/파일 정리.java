import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        Map<String, Integer> files = new HashMap<>();

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String extension = st.nextToken();
            files.merge(extension, 1, Integer::sum);
        }

        files.entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
                .forEach(f -> System.out.println(f.getKey() + " " + f.getValue()));

        br.close();
    }
}
