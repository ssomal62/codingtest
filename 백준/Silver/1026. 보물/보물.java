

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX = Integer.parseInt(br.readLine());

        int[] a = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();

        int[] b = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        
        Integer[] B_indices = new Integer[MAX];
        for (int i = 0; i < MAX; i++) {
            B_indices[i] = i;
        }
        
        Arrays.sort(a);
        Arrays.sort(B_indices, (i1, i2) -> Integer.compare(b[i2], b[i1]));

        int sum = 0;

        for(int i = 0; i < MAX; i++) {
            sum += a[i] * b[B_indices[i]];
        }

        System.out.println(sum);
        br.close();
    }

}
