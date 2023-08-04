import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            for(int j = 0; j < n; j++){
                answer.add(n);
            }
        }

        
        return answer;
    }
}