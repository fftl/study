package problems;
/*
* https://www.acmicpc.net/problem/1107
* 백준_1107_리모컨 G5
* */

import java.util.Arrays;
import java.util.Scanner;


/*
5457
3
6 7 8
 */
/*
0
 */
public class Baekjoon_1107 {
    static int n;
    static int[] button;
    public static void main(String args[]){
        n = 100;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        button = new int[M];
        for(int i=0; i<M; i++){
            button[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(button));

        sc.close();
    }

}
