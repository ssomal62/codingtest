import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 현재 시각 구하기
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        // 요리 시간 입력 받기
        int time = Integer.parseInt(br.readLine());

        // 현재 시간을 초로 변환
        int totalSeconds = hour * 3600 + minute * 60 + second + time;

        // 종료 시각 계산
        hour = (totalSeconds / 3600) % 24;
        minute = (totalSeconds % 3600) / 60;
        second = totalSeconds % 60;

        bw.write(hour + " " + minute + " " + second);

        bw.flush();
        bw.close();
        br.close();

    }
}
