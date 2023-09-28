import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a.chars()
            .mapToObj(i -> ('A' <= i)&&(i <= 'Z') ? (char)(i + 32) : (char)(i - 32))
            .forEach(System.out::print);
    }
}