package two_pointer_sliding_window;

import java.io.*;
import java.util.*;

/**
 * 파일명: MergeTwoArrays.java
 * 문제명: 두 배열 합치기
 * 알고리즘: Two Pointers
 */
public class MergeTwoArrays {
    public List<Integer> solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        while(p1 < n) answer.add(a[p1++]);
        while(p2 < m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) throws Exception{
        MergeTwoArrays T = new MergeTwoArrays();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st1.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int x : T.solution(n, m, a, b)) {
            sb.append(x).append(" ");
        }
        System.out.println(sb);
    }
}
