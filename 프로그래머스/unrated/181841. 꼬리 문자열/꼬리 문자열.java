class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].indexOf(ex) != -1){
                str_list[i] = "";
            }
        }
        
        for(String s : str_list){
            answer += s;
        }
        
        return answer;
    }
}