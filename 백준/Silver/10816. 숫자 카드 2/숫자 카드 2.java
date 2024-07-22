import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fNum = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int sNum = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < sNum; i++) {
            String s = st2.nextToken();
            map.put(s, 0);
            list.add(s);
        }

        while (st1.hasMoreTokens()) {
            String compare = st1.nextToken();
            if (map.containsKey(compare)) {
                map.merge(compare, 1, Integer::sum);
            }
        }

        String result = list.stream().map(e-> map.get(e).toString()).collect(Collectors.joining(" "));

        System.out.println(result);

        br.close();
    }
}