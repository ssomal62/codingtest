import java.util.Scanner;

public class Main {
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.

    public void solution(String str){
        String[] numbers= str.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        String result =  a > b ? ">" : (a < b ? "<" : "==");
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Main sol = new Main();

        sol.solution(a + " " + b);
    }
   
}
