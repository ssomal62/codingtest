import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
         
        int s = (num % 2) == 0 ? (-num / 2) + 1 : (-num / 2);

     
        return IntStream.iterate(s, i -> i + 1) .map(i -> (int) total / num + i).limit(num).toArray();
    }
}