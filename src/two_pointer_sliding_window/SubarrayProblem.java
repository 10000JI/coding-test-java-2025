package two_pointer_sliding_window;

import java.io.*;
import java.util.*;

/**
 * 파일명: SubarrayProblem.java
 * 문제명: 연속부분수열
 * 알고리즘: Two Pointers, Sliding Windows
 */
public class SubarrayProblem {
    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        SubarrayProblem T = new SubarrayProblem();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(T.solution(n, m, arr));
    }
}
