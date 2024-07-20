import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        String line;

        while ((line = br.readLine()) != null) {
            if(line.equals("")) break;

            st = new StringTokenizer(line, " ");

            int iter = Integer.parseInt(st.nextToken());
            String str = st.hasMoreTokens() ? st.nextToken().trim() : "";

            str.chars().forEach(c-> sb.append(String.valueOf((char)c).repeat(iter)));

            if(!str.equals("")){
                sb.append("\n");
            }
        }

        System.out.print(sb.toString());

        br.close();
    }
}