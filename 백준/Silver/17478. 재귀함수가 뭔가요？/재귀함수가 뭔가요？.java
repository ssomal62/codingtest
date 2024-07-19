import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    int barCount = 0;
    int max = 0;
    boolean end = false;
    StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        Main sol = new Main();

        sol.max = n;
        String story1 = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";

        sol.sb.append(story1);

        sol.function(n, 0);

        System.out.println(sol.sb.toString());
        br.close();
    }

    public int function(int n, int depth) {

        String story2 =
                "_".repeat(barCount) + "\"재귀함수가 뭔가요?\"\n" +
                        "_".repeat(barCount) + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                        "_".repeat(barCount) + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                        "_".repeat(barCount) + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";

        String story3 =
                "_".repeat(barCount) + "\"재귀함수가 뭔가요?\"\n" +
                        "_".repeat(barCount) + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";

        String story4 =
                "_".repeat(barCount) + "라고 답변하였지.\n";



        if (n == 0) {
            if(depth == 0) return 1;
            if(end && depth == 1) sb.append(story4);

            if(end && depth > 1) {
                barCount -= 4;
                sb.append(story4);
            }

            if(!end) {
                sb.append(story3);
                sb.append(story4);
                barCount -= 4;
                end = !end;
                depth++;
            }
            return function(n, depth - 1);
        }

        if (n <= max) {
            sb.append(story2);
            barCount += 4;
            depth++;
        }

        return function(n - 1, depth);
    }


}