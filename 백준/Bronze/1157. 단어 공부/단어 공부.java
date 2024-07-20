import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    //49808	428
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();


        for(char c : str.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }

        Optional<Map.Entry<Character, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

  
        if(maxEntry.isPresent()) {
            int maxValue = maxEntry.get().getValue();
            char maxKey = maxEntry.get().getKey();
            
            map.remove(maxKey);
            
            boolean duplicateCheck = map.containsValue(maxValue);
            System.out.println(duplicateCheck ? "?" : maxKey);
        }

        br.close();
    }
}
