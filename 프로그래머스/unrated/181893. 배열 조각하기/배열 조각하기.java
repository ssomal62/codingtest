import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());

        AtomicInteger limit_Num  = new AtomicInteger();

        IntStream.range(0,query.length)
                .map(i -> {
                    if(i % 2 == 0){
                        limit_Num.set(list.size() - 1 - query[i]);
                        return list.size() - 1 ;
                    } else {
                        limit_Num.set(query[i]);
                        return 0;
                    }
                })
        .forEach(i -> IntStream.iterate(i , n -> i == 0 ? n : n - 1)
        .limit(limit_Num.get())
        .forEach(n -> list.remove(n)));

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}