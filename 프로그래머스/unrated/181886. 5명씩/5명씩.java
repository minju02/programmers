import java.util.*;

class Solution {
    public List solution(String[] names) {
        List answer = new ArrayList<>();
        
        for(int i = 0; i < names.length; i += 5){
            answer.add(names[i]);
        }
        
        return answer;
    }
}