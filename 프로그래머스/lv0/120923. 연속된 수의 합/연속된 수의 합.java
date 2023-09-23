import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
         
        int s = num%2 == 0 ? -num/2+1 : -num/2 ;
        int e = num%2 == 0 ? s-1 : s;
       
        return IntStream.rangeClosed(s, Math.abs(e)).map(k-> (int)total/num + k).toArray();
    }
}