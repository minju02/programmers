class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        char a = alp.charAt(0);
        
        for(int i = 0; i < my_string.length(); i++){
            if(a == my_string.charAt(i)){
                answer += my_string.substring(i, i+1).toUpperCase();
            }else{
                answer += my_string.substring(i, i+1);
            }
        }
        
        return answer;
    }
}