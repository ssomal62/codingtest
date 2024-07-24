import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < MAX; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push_back" :
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front" :
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "front" :
                    sb.append(dq.peekFirst() == null ? -1 : dq.peekFirst()).append("\n");
                    break;
                case "back" :
                    sb.append(dq.peekLast() == null ? -1 : dq.peekLast()).append("\n");
                    break;
                case "pop_front" :
                    Integer firstElement = dq.pollFirst();
                    sb.append(firstElement == null ? -1 : firstElement).append("\n");
                    break;
                case "pop_back" :
                    Integer lastElement = dq.pollLast();
                    sb.append(lastElement == null ? -1 : lastElement).append("\n");
                    break;
                case "size" :
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                    break;
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}