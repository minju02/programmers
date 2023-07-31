import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int n, int k) {
        List answer = new ArrayList<>();
        
        for(int i = 1; i < n+1; i++){
            if(i%k==0){
                answer.add(i);
            }
        }
        
        return answer;
    }
}