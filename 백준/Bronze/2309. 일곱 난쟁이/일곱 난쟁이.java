
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int max = 9;
    static int[] dwarfs = new int[max];
    static boolean[] selected = new boolean[max];
    static int[] result = new int[7];
    static int sum = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (--max >= 0) {
            dwarfs[max] = sc.nextInt();
            sum += dwarfs[max];
        }
        sc.close();

        findDwarfs(0, sum, 0);

        Arrays.sort(result);
        Arrays.stream(result).forEach(System.out::println);

    }

    static void findDwarfs(int index, int sum, int count) {
        if(count == 2) {
            if(sum == 100) {
                int resultIndex = 0;
                for(int i = 0; i < 9; i++) {
                    if(!selected[i]){
                        result[resultIndex++] = dwarfs[i];
                    }
                }
            }
            return;
        }

        for (int i = index; i < 9; i++) {
            selected[i] = true;
            findDwarfs(i + 1, sum - dwarfs[i], count + 1);
            selected[i] = false;
        }
    }
}
