import java.util.*;

class Solution {
    public List solution(String myString) {
        List answer = new ArrayList<>();
        
        String[] arr = myString.split("x", myString.length());
        
        for(int i = 0; i < arr.length; i++){
            answer.add(arr[i].length());
        }
        
        return answer;
    }
}