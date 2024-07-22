package chap1;

import java.util.Scanner;

public class String8 {
    public String solution(String s){
        String answer = "No";
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            answer = "Yes";
        }else {
            answer = "No";
        }
        return answer;
    }
    public static void main(String[] args) {
        String8 T = new String8();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
