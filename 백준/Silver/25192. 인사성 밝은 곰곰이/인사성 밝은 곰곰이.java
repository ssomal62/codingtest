import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> users = new HashSet<>();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            if(line.equals("ENTER")){
                sum += users.size();
                users.clear();
            } else {
                users.add(line);
            }
        }

        sum += users.size();
        System.out.println(sum);

        br.close();
    }
}
