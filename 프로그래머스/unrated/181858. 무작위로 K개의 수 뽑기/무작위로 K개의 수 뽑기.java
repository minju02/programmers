import java.util.*;

class Solution {
    public List solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(answer.size()<k){    
                if(!answer.contains(arr[i])){
                    answer.add(arr[i]);
                }
            }else{
                break;
            }
        }
        
        while(answer.size() < k){
            answer.add(-1);
        }
        
        return answer;
    }
}