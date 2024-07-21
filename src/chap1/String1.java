package chap1;

import java.util.Scanner;

public class String1 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }
//        for(char x : str.toCharArray()) {
//            if(x == t) {
//              answer ++;
//              }
//        }
        return answer;
    }

    public static void main(String[] args) {
        String1 T = new String1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(T.solution(str, c));

    }

}