import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine());

        int[] coords = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<Integer> sortedSet = new TreeSet<>();
        for (int coord : coords) {
            sortedSet.add(coord);
        }

        Map<Integer, Integer> coordMap = new HashMap<>();
        int index = 0;
        for (int coord : sortedSet) {
            coordMap.put(coord, index++);
        }

        StringBuilder result = new StringBuilder();
        for (int coord : coords) {
            result.append(coordMap.get(coord)).append(" ");
        }

        System.out.println(result.toString().trim());
        br.close();
    }

}
