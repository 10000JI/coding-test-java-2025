package two_pointer_sliding_window;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 파일명: ConsecutiveSum.java
 * 문제명: 연속된 자연수의 합
 * 알고리즘: Binary Search
 */
public class ConsecutiveSum {
    public int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        ConsecutiveSum T = new ConsecutiveSum();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = T.solution(n);
        System.out.println(answer);
    }
}
