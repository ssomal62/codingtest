import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        PriorityQueue<String> que = new PriorityQueue<>((a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < max; i++) {
            String s = br.readLine();
            if(set.add(s)) {
                que.offer(s);
            }
        }

        while (!que.isEmpty()){
            System.out.println(que.poll());
        }
        
        br.close();
    }
}
