import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            int l = answer.size() - 1;
            if(answer.isEmpty()){
                answer.add(arr[i]);
            }else if(arr[i] == answer.get(l)){
                answer.remove(l);
            }else{
                answer.add(arr[i]);
            }
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        
        return answer;
    }
}