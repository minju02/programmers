import java.util.*;

class Solution {
    public List solution(String myStr) {
        String[] arr = myStr.split("a|b|c");
        
        List answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                answer.add(arr[i]);
            }
        }
        
        if(answer.isEmpty()){
            answer.add("EMPTY");
        }
        
        return answer;
    }
}