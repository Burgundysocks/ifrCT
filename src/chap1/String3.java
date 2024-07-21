package chap1;

import java.util.Scanner;

public class String3 {

    public String solution(String str) {
        String answer ="";
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
        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m){
            answer = str;
        }


        return answer;
    }
    public static void main(String[] args) {
        String3 T = new String3();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
