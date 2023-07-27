import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        answer.add(n);
        
        while(true){
            if(n%2==0){
                n /= 2;
            }else{
                n = 3*n+1;
            }
            answer.add(n);
            if(n == 1){
                break;
            }
        }
        
        return answer;
    }
}