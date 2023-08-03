import java.util.*;

class Solution {
    public List solution(String[] todo_list, boolean[] finished) {
        List answer = new ArrayList<>();
        
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        
        return answer;
    }
}