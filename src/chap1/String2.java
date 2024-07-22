package chap1;

import java.util.Scanner;

public class String2 {
    public String solution(String str) {
        String answer = "";
        //문자열 초기화
        for(char x : str.toCharArray()) {
            //입력받은 문자열 순환(아스키 코드로)
//            if(Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            }
//            else{
//                answer += Character.toLowerCase(x);
//            }
            if(x >= 65 && x <= 90){
                //아스키코드 기준 대문자라면
                answer += (char)(x+32);
                //+32를 해 소문자로 변환
            }
            else if(x >= 97 && x <= 122){
                //아스키코드기준 소문자라면
                answer += (char)(x-32);
                //대문자로 변환
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String2 T = new String2();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        //문자열 입력
        System.out.println(T.solution(s));

    }
}
