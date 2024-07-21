package chap1;

import java.util.Scanner;

public class String2 {
    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
//            if(Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            }
//            else{
//                answer += Character.toLowerCase(x);
//            }
            if(x >= 65 && x <= 90){
                answer += (char)(x+32);
            }
            else if(x >= 97 && x <= 122){
                answer += (char)(x-32);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String2 T = new String2();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));

    }
}
