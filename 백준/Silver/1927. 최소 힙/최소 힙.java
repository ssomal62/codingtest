import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> que = new PriorityQueue<>();
        StringBuffer sb = new StringBuffer();
        final int MAX = sc.nextInt();

        for (int i = 0; i < MAX; i++) {
            int num = sc.nextInt();

            if(num == 0) {
                sb.append(que.isEmpty() ? 0 : que.poll()).append("\n");
            } else {
                que.offer(num);
            }

        }
        System.out.println(sb.toString());
    }
}
