package hashmap_treeset;

import java.io.*;
import java.util.*;

/**
 * 파일명: ClassPresident.java
 * 문제명: 학급 회장(해시)
 * 알고리즘: HashMap
 */
public class ClassPresident {

    public char solution(int n, String str) {
        char answer= ' ';
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = c;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception{
        ClassPresident T = new ClassPresident();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(T.solution(n, str));
    }
}
