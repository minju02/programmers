class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int a = 1000000;
            for(int j = queries[i][0]; j < queries[i][1]+1; j++){
                if(arr[j] > queries[i][2] && a>arr[j]){
                    a = arr[j];
                }
            }
            if(a == 1000000){
                a = -1;
            }
            answer[i] = a;
        }
        
        return answer;
    }
}