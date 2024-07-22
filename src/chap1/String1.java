package chap1;

import java.util.Scanner;

public class String1 {
    public int solution(String str, char t) {
        int answer = 0;
        //정수 초기화
        str = str.toUpperCase();
        //입력받은 문자열 전부 대문자 변환
        t = Character.toUpperCase(t);
        //입력받은 문자 대문자 변환
        for (int i = 0; i < str.length(); i++) {
            //for문으로 입력받은 문자열 순환
            if (str.charAt(i) == t) {
                //입력한 문자와 같은 알파벳이 문자열에 있다면
                answer++;
                //초기화한 정수에 + 1
            }
        }
//        for(char x : str.toCharArray()) {
//            if(x == t) {
//              answer ++;
//              }
//        }
        return answer;
        //정수 반환
    }

    public static void main(String[] args) {
        String1 T = new String1();
        Scanner sc = new Scanner(System.in);
        //스캐너

        String str = sc.next();
        //문자열 입력
        char c = sc.next().charAt(0);
        //문자 입력

        System.out.println(T.solution(str, c));

    }

}