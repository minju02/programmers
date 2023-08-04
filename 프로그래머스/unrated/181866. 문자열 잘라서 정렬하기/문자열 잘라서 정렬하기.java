import java.util.*;

class Solution {
    public List solution(String myString) {
        List answer = new ArrayList<>();
        
        String[] arr = myString.split("x");
        
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                answer.add(arr[i]);
            }
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}