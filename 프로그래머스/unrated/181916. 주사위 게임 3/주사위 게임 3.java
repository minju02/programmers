import java.lang.Math;

class Solution {
    public double solution(int a, int b, int c, int d) {
        double answer = 0;
        
        boolean ab = a==b;
        boolean ac = a==c;
        boolean ad = a==d;
        boolean bc = b==c;
        boolean bd = b==d;
        boolean cd = c==d;
        
        if(ab && bc && cd){
            answer = 1111 * a;
        }else if(ab && bc){
            answer = Math.pow(10*a+d, 2);
        }else if(ab && bd){
            answer = Math.pow(10 * a + c, 2);
        }else if(ac && cd){
            answer = Math.pow(10 * a + b, 2);
        }else if(bc && cd){
            answer = Math.pow(10 * b + a, 2);
        }else if(ab){
            if(cd){
                answer = (a+c) * Math.abs(a-c);
            }else{
                answer = c*d;
            }
        }else if(bc){
            if(ad){
                answer = (b+a) * Math.abs(b-a);
            }else{
                answer = a*d;
            }
        }else if(cd){
            if(ab){
                answer = (c+a) * Math.abs(c-a);
            }else{
                answer = a*b;
            }
        }else if(ad){
            if(bc){
                answer = (a+b) * Math.abs(a-b);
            }else{
                answer = c*b;
            }
        }else if(ac){
            if(bd){
                answer = (a+b) * Math.abs(a-b);
            }else{
                answer = d*b;
            }
        }else if(bd){
            if(ac){
                answer = (a+c) * Math.abs(a-c);
            }else{
                answer = a*c;
            }
        }else{
            answer = a;
            if(answer > b){
                answer = b;
            }
            if(answer > c){
                answer = c;
            }
            if(answer > d){
                answer = d;
            }
        }
        
        return answer;
    }
}