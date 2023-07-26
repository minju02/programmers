class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        
        String[] str = new String[code.length()];
        
        for(int i = 0; i<code.length(); i++){
            str[i] = code.substring(i, i+1);
        }
        
        for(int i = 0; i < code.length(); i++){
            if(mode == 0){
                if(!str[i].equals("1") && i%2==0){
                    answer += str[i];
                }else if(str[i].equals("1")){
                    mode = 1;
                }else{
                    
                }
            }else{
                if(!str[i].equals("1")&& (i%2==1 || i==0)){
                    answer += str[i];
                    
                }else if(str[i].equals("1")){
                    mode = 0;
                    
                }else{
                   
                }
            }
        }
        
        if(answer == ""){
            answer = "EMPTY";
        }
        
        return answer;
    }
}