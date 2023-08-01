class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        while(idx < arr.length){
            if(arr[idx] == 1){
                answer = idx;
                break;
            }else{
                answer = -1;
            }
            idx++;
        }
        
        return answer;
    }
}