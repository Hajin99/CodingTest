import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Long> solution(int x, int n) {
        List <Long> answer = new ArrayList<>();
        
        long plus = x;
        while(n>0){
            answer.add(plus);
            plus+=x;
            n--;
        }
        return answer;
    }
}