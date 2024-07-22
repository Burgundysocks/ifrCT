package chap1;

import java.util.Scanner;

public class String7 {
    public String solution(String str) {
        String answer = "YES";
//        str = str.toLowerCase();
//        int len = str.length();
//        for (int i = 0; i < len; i++) {
//            if(str.charAt(i) != str.charAt(len - 1 - i)) {
//                answer = "NO";
//            }
//        }
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        } else{
            answer = "NO";
        }
        return answer;
    }
    public static void main(String[] args) {
        String7 T = new String7();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
