import java.util.*;

class Solution {
    public List solution(int[] arr) {
        
        List answer = new ArrayList<>();
        
        List<Integer> idx = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                idx.add(i);
            }
        }
        
        if(idx.isEmpty()){
            answer.add(-1);
        }else if(idx.size() > 1){
            
            int start = idx.get(0);
            int fin = idx.get(idx.size()-1);
            
            for(int i = start; i < fin+1; i++){
                answer.add(arr[i]);
            }
        }else{
            answer.add(2);
        }
        
        return answer;
    }
}