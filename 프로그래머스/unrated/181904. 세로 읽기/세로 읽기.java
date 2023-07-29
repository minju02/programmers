import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        
        int count = (int)Math.ceil((double)my_string.length()/m);
        
        int j = 0;
        for(int i = 0; i < count; i++){
            
            list.add(my_string.substring(j, j+m));
            answer += list.get(i).substring(c-1,c);
            j += m;
        }
        
        return answer;
    }
}