class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2==1){
            for(int i=1; i<=n;){
                answer += i;
                i+=2;
            }
        }else{
            for(int i = 2; i<=n;){
                answer += i*i;
                i+=2;
            }
        }
        
        return answer;
    }
}