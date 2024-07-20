import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] count = new int[26];  // A-Z 카운트를 위한 배열
        String str = br.readLine();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }
        
        int maxCount = 0;
        char maxChar = '?';
        boolean isDuplicate = false;
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) (i + 'A');
                isDuplicate = false;
            } else if (count[i] == maxCount) {
                isDuplicate = true;
            }
        }
        
        System.out.println(isDuplicate ? "?" : maxChar);
        
        br.close();
    }
}