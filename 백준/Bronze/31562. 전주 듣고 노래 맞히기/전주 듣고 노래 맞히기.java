

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int SONGS_COUNT = Integer.parseInt(st.nextToken());
        final int INTRO_COUNT = Integer.parseInt(st.nextToken());

        HashMap<String, String> songsData = new HashMap<>();

        for(int i = 0; i < SONGS_COUNT; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            st1.nextToken();

            String title = st1.nextToken();
            String intro = "";
            int count = 0;

            while (count < 3) {
                intro += st1.nextToken();
                count++;
            }

            if(songsData.containsKey(intro)) {
                songsData.put(intro, "?");
            } else {
                songsData.put(intro, title);
            }
        }

        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < INTRO_COUNT; i++) {
            String findIntro = br.readLine().replace(" ", "");

            if(songsData.containsKey(findIntro)){
                sb.append(songsData.get(findIntro)).append("\n");
            } else {
                sb.append("!\n");
            }
        }

        System.out.println(sb);

        br.close();
    }
}