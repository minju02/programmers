class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] l = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            l[i] = my_string.substring(i,i+1);
        }
        
        for(int i : indices){
            l[i] = "";
        }
        
        for(int i = 0; i < l.length; i++){
            answer += l[i];
        }
        
        return answer;
    }
}