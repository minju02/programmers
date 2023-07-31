class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        String[] str = new String[code.length()];
        
        for(int i = 0; i < str.length; i++){
            str[i] = code.substring(i, i+1);
            if(i % q == r){
                answer += str[i];
            }
        }
        
        return answer;
    }
}