class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        if(s > 0){
            answer += my_string.substring(0, s);
        }
        
        for(int i = e; s < i+1; i--){
            answer += my_string.substring(i, i+1);
        }
        
        if(e < my_string.length()-1){
            answer += my_string.substring(e+1, my_string.length());
        }
        
        return answer;
    }
}