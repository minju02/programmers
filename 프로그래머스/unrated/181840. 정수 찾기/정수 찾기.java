import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int num : num_list){
            list.add(num);
        }
        
        if(list.indexOf(n) != -1){
            answer  = 1;
        }
        
        return answer;
    }
}