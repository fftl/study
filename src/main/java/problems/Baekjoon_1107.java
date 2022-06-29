package problems;
/*
* https://www.acmicpc.net/problem/1107
* 백준_1107_리모컨 G5
* */

/* 입력예
5457
3
6 7 8
 */

/* 출력예
6
 */
import java.util.Scanner;

public class Baekjoon_1107 {
    static int N, min, minNum;
    static boolean[] button;

    static void check(int num){
        int result = Math.abs(N-num) + Integer.toString(num).length();
        min = Math.min(result, min);
        return;
    }

    static void createNum(String s){
        if(Integer.parseInt(s) > 999999){
            return;
        } else if (s.equals("0")){
            check(0);
            return;
        } else {
            check(Integer.parseInt(s));
            for(int i=0; i<10; i++){
                if(!button[i]) createNum(s + Integer.toString(i));
            }
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        button = new boolean[10];
        for(int i=0; i<M; i++) {
            button[sc.nextInt()] = true;
        }

        min = Math.abs(N-100);
        for(int i=0; i<10; i++){
            if(!button[i]) createNum(Integer.toString(i));
        }

        System.out.println(min);

        sc.close();
    }

}
