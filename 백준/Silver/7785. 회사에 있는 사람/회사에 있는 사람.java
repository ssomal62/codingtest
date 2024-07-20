import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String name = st.nextToken();
            String commute = st.nextToken();

            if (commute.equals("leave")) {
                set.remove(name);
            } else {
                set.add(name);
            }
        }

        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        br.close();
    }
}