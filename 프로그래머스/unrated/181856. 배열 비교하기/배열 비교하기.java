class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int a = arr1.length;
        int b = arr2.length;
        
        if(a != b){
            if(a>b){
                answer = 1;
            }else{
                answer = -1;
            }
        }else{
            int asum = 0;
            int bsum = 0;
            
            for(int i = 0; i < a; i++){
                asum += arr1[i];
                bsum += arr2[i];
            }
            
            if(asum == bsum){
                answer = 0;
            }else{
                if(asum > bsum){
                    answer = 1;
                }else{
                    answer = -1;
                }
            }
            
        }
        
        return answer;
    }
}