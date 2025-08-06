package two_pointer_sliding_window;

import java.io.*;
import java.util.*;

/**
 * 파일명: MaxSales.java
 * 문제명: 최대 매출
 * 알고리즘: Sliding Windows
 */
public class MaxSales {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) throws Exception{
        MaxSales T = new MaxSales();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(T.solution(n, k, arr));
    }
}
