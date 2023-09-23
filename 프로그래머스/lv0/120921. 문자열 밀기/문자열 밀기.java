class Solution {
    static int count = 0;
    public static int solution(String A, String B) {
    if (A.equals(B)) return count;
    count++;  
    return A.length() == count ? -1 : solution(A.charAt(A.length() -1) + A.substring(0, A.length() -1), B);
    }
}