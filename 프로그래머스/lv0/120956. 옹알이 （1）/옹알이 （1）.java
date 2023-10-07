class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] words = {"aya", "ye", "woo", "ma"};

        for(String s : babbling) {
            for (String w : words){
                s = s.replaceFirst(w," ".repeat(w.length()));
            }
            if (s.trim().length() == 0){
                answer++;
            }
        }

        return answer;
    }
}