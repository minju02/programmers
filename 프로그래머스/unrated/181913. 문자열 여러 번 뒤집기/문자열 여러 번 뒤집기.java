class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] str = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            str[i] = my_string.substring(i, i+1);
        }
        
        for(int i = 0; i<queries.length; i++){
            
            int a = queries[i][0];
            int b = queries[i][1];
            
            for(int j = a; j < b; j++){
                String s = str[a];
                str[a] = str[b];
                str[b] = s;
                a++;
                b--;
                if(a==b){
                    break;
                }
            }
            
        }
        
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }
        
        return answer;
    }
}