import java.util.*;

class Solution {
    public List solution(String my_string) {
        
        List answer = new ArrayList<>();
        String[] arr = my_string.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}