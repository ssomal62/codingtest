
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        Stack<Integer> buildings = new Stack<>();
        int result = 0;

        while (max-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            st.nextToken();
            int y = Integer.parseInt(st.nextToken());

            while (!buildings.isEmpty() && buildings.peek() > y) {
                buildings.pop();
                result++;
            }

            if (buildings.isEmpty() || buildings.peek() < y) {
                buildings.push(y);
            }
        }

        while (!buildings.isEmpty() && buildings.peek() > 0) {
            buildings.pop();
            result++;
        }

        System.out.println(result);
        br.close();
    }
}
