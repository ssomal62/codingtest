

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<String> list = br.readLine().chars()
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.toCollection(LinkedList::new));

        final int MAX = Integer.parseInt(br.readLine());

        Stack<String> ch = new Stack<>();

        for (int i = 0; i < MAX; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "L":
                    if(!list.isEmpty()) {
                        ch.push(list.removeLast());
                    }
                    break;
                case "D":
                    if(!ch.isEmpty()) {
                        list.addLast(ch.pop());
                    };
                    break;
                case "B":
                    if(!list.isEmpty()){
                        list.removeLast();
                    }
                    break;
                case "P":
                    list.addLast(st.nextToken());
                    break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s : list) {
            result.append(s);
        }
        while (!ch.isEmpty()) {
            result.append(ch.pop());
        }


        System.out.println(result);
        br.close();
    }
}
