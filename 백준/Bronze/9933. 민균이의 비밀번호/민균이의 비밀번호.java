

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();
        char[] password = new char[]{};
        int len = 0;

        for (int i = 0; i <MAX; i++) {
            String word = br.readLine();
            String reverse = new StringBuilder(word).reverse().toString();
            boolean isReversed = false;

            if(!words.isEmpty()) {
                isReversed = words.contains(reverse);
            }
            if(word.equals(reverse) || isReversed){
                password = word.toCharArray();
                len = password.length;
                break;
            }

            words.add(word);
        }

        System.out.println(len + " " + password[len / 2]);

        br.close();
    }
}
