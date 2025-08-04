package two_pointer_sliding_window;

import java.io.*;
import java.util.*;

/**
 * 파일명: CommonElements.java
 * 문제명: 공통원소 구하기
 * 알고리즘: Two Pointers
 */
public class CommonElements {
    public List<Integer> solution (int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        // 오름차순 정렬 먼저!
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        CommonElements T = new CommonElements();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st1.nextToken());

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) b[i] = Integer.parseInt(st2.nextToken());

        List<Integer> answer = T.solution(n, m, a, b);
        StringBuilder sb = new StringBuilder();
        for (Integer i : answer) sb.append(i).append(" ");
        System.out.println(sb);
    }
}