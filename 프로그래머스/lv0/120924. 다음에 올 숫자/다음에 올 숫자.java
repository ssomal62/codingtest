class Solution {
    public int solution(int[] common) {
        int ratio = 1; //등비
        int diff = 0;  //등차

        int e1 = common[0];
        int e2 = common[1];
        int e3 = common[2];
        int el = common[common.length-1];

        if(e2-e1 == e3-e2) {       
            diff = e2 - e1;
        } else {                        
            ratio = e2 / e1;
        }
        return el * ratio + diff;
    }
}