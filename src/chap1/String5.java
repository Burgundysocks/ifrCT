package chap1;

import java.util.ArrayList;
import java.util.Scanner;

public class String5 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = s.length - 1;
        while (lt < rt) {
            if(!Character.isAlphabetic(s[lt])) {
                //알파벳이라면
                lt ++;
            }
            else if(!Character.isAlphabetic(s[rt])) {
                rt --;
            }
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt --;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }


    public static void main(String[] args) {
        String5 T = new String5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
