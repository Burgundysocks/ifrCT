package chap1;

import java.util.Scanner;

public class String9 {
    public int solution(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
//            if(x >=48 && x <= 57){
//                answer = answer*10+(x-48);
//            }
            if(Character.isDigit(x)){
                answer += x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String9 T = new String9();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
