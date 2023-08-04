class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.substring(i, i+1).equals("A")){
                str += "B";
            }else{
                str += "A";
            }
        }
        
        
        if(str.indexOf(pat) != -1){
            answer = 1;
        }
        
        return answer;
    }
}