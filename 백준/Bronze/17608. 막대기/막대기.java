

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX = Integer.parseInt(br.readLine());

        Stack<Integer> sticks = new Stack<>();

        for (int i = 0; i < MAX; i++) {
            int num = Integer.parseInt(br.readLine());
            while (!sticks.isEmpty() && sticks.peek() <= num) {
                sticks.pop();
            }
            sticks.push(num);
        }

        System.out.println(sticks.size());
        br.close();
    }
}
