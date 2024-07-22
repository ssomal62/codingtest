import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fNum = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        HashSet<String> sgCards = new HashSet<>();

        for(int i = 0; i < fNum; i++) {
            sgCards.add(st1.nextToken());
        }

        br.readLine();

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        while(st2.hasMoreTokens()){
            int check = sgCards.contains(st2.nextToken()) ? 1 : 0;
            sb.append(check + " ");
        }

        System.out.println(sb.toString().trim());

        br.close();
    }
}
