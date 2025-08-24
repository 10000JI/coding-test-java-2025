package two_pointer_sliding_window;

import java.util.*;
import java.io.*;

/**
 * 파일명: LongestConsecutiveSubsequence.java
 * 문제명: 최대 길이 연속부분수열
 * 알고리즘: Two Pointers, Sliding Windows
 */
public class LongestConsecutiveSubsequence {

    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        LongestConsecutiveSubsequence T = new LongestConsecutiveSubsequence();
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
