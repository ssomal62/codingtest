
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int switchCount = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<>();
        while (st1.hasMoreTokens()) {
            list.add(Integer.parseInt(st1.nextToken()));
        }


        int studentCount = Integer.parseInt(br.readLine());


        for (int i = 0; i < studentCount; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int gender = Integer.parseInt(st2.nextToken());
            int num = Integer.parseInt(st2.nextToken());

            if (gender == 1) {

                for (int j = num - 1; j < list.size(); j += num) {
                    list.set(j, list.get(j) == 1 ? 0 : 1);
                }
            } else if (gender == 2) {
                int left = num - 1;
                int right = num - 1;

                list.set(left, list.get(left) == 1 ? 0 : 1);


                while (left > 0 && right < list.size() - 1) {
                    left--;
                    right++;
                    if (list.get(left).equals(list.get(right))) {
                        list.set(left, list.get(left) == 1 ? 0 : 1);
                        list.set(right, list.get(right) == 1 ? 0 : 1);
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(" ");
            }
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        if (list.size() % 20 != 0) {
            System.out.println();
        }

        br.close();
    }
}
