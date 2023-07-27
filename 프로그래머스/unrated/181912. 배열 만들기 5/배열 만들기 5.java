import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List answer = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            String str = intStrs[i].substring(s, s+l);
            if(Integer.parseInt(str) > k){
                answer.add(Integer.parseInt(str));
            }
        }
        
        return answer;
    }
}