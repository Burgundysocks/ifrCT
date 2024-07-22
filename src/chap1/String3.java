package chap1;

import java.util.Scanner;

public class String3 {

    public String solution(String str) {
        String answer ="";
        //문자열 초기화
//        int m = Integer.MIN_VALUE;
//        String [] s = str.split(" ");
//        for(String x: s){
//            int len = x.length();
//            if(len > m){
//                m = len;
//                answer = x;
//            }
//        }

        int m = Integer.MIN_VALUE, pos;
        //최대 문자열 길이를 Integer.MIN_VALUE를 통해 초기화
        //pos라는 새로운 정수 변수 선언
        while((pos = str.indexOf(' ')) != -1){
            //str에 있는 (' ')공백 문자의 위치를 pos에 저장
            //-1이라면 반환 후 종료
            String tmp = str.substring(0, pos);
            //첫 공백문자까지의 길이를 tmp에 저장
            int len = tmp.length();
            //tmp의 문자 길이 len에 저장
            if(len > m){
                m = len;
                answer = tmp;
                //len이 m보다 크다면 m에 len저장
                //그리고 문자여 tmp를 answer에 저장
            }
            str = str.substring(pos+1);
            //str을 첫 공백부터 끝까지의 문자열로 갱신
        }
        //남아있는 문자열의 길이가 현재 str보다 길다면 갱신
        if(str.length() > m){
            answer = str;
        }


        return answer;
    }
    public static void main(String[] args) {
        String3 T = new String3();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        //문자열 입력
        System.out.println(T.solution(str));
    }
}
