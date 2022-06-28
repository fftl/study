package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* https://www.acmicpc.net/problem/11052
* 백준_11052_카드 구매하기 S1
* */

public class Baekjoon_11052 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] sum = new int[n + 1];

        String[] str = br.readLine().split(" ");
        for (int i = 1; i < str.length + 1; i++) {
            arr[i] = Integer.parseInt(str[i - 1]);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum[i] = Math.max(sum[i], sum[i - j] + arr[j]);
            }
        }

        System.out.println(sum[n]);
    }
}
