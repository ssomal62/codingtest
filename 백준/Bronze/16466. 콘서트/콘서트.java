import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int lastSeat = 0;
        int[] soldout = new int[max];


        for (int i = 0; i < max; i++) {
            int num = Integer.parseInt(st.nextToken());
            soldout[i] = num;

            if(lastSeat < num) {
                lastSeat = num;
            }
        }

        int[] count = new int[lastSeat + 1];

        for (int i = 0; i < max; i++) {
            int num = soldout[i];
            if (num <= lastSeat) {
                count[num]++;
            }
        }

        int result = -1;
        for(int i = 1; i <= lastSeat; i++) {
            if(count[i] == 0) {
                result = i;
                break;
            }
        }
        
        if (result == -1) {
            result = lastSeat + 1;
        }

        System.out.println(result);

        br.close();

    }
}