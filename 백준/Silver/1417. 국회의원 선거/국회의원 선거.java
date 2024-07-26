

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = Integer.parseInt(br.readLine());
        int dasome = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> candidates = new PriorityQueue<>(Collections.reverseOrder());

        int count = 0;

        for(int i = 1 ; i < MAX; i++) {
            candidates.offer(Integer.parseInt(br.readLine()));
        }

        while (!candidates.isEmpty() && dasome <= candidates.peek()) {
            candidates.offer(candidates.poll() - 1);
            dasome++;
            count++;
        }

        System.out.println(count);

        br.close();
    }
}