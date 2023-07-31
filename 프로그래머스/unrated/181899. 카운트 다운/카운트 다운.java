import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int start, int end) {
        List answer = new ArrayList<>();
        
        for(int i = start; i > end-1; i--){
            answer.add(i);
        }
        
        return answer;
    }
}