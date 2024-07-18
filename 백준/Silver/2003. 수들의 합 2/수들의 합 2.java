import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int range = Integer.parseInt(st1.nextToken());
        int target = Integer.parseInt(st1.nextToken());

        int s = 0;
        int e = 0;
        int sum = 0;
        int count = 0;

        String line = br.readLine();
        int[] arr = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (e < range) {
            sum += arr[e];
            e++;
            
            while (sum > target && s < e) {
                sum -= arr[s];
                s++;
            }

            if (sum == target) {
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }
}