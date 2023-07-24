import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result="";
        
        for(int i = 0; i<a.length(); i++){
            char b = a.charAt(i);
            if(b<91){
                b+=32;
            }else{
                b-=32;
            }
            result += b;
        }
        System.out.print(result);
        
    }
}