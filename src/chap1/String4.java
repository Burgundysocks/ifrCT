package chap1;

import java.util.ArrayList;
import java.util.Scanner;

public class String4 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //배열리스트 초기화
//        for(String x: str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        for(String x : str){
            //배열만큼 순환
            char[] s = x.toCharArray();
            //x의 문자열들을 문자배열로 만들어줌
            int lt = 0, rt = x.length() - 1;
            //lt는 0번 인덱스, rt는 맨 마지막 인덱스
            while (lt < rt) {
                //반복문 통해서
                char tmp = s[lt];
                s[lt] = s[rt];
                //lt와 rt를 바꿔나감
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        String4 T = new String4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //숫자 입력
        String[] str = new String[n];
        //입력한 숫자에 맞는 문자열 배열
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            //배열 길이만큼의 문자열 입력
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
