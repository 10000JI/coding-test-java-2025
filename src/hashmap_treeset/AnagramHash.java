package hashmap_treeset;

import java.io.*;
import java.util.*;

/**
 * 파일명: AnagramHash.java
 * 문제명: 아나그램(해시)
 * 알고리즘: HashMap
 */
public class AnagramHash {
    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            }
            map.put(c, map.get(c) - 1);
        }
        return answer;
    }

    public static void main(String[] args) throws Exception{
        AnagramHash T = new AnagramHash();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(T.solution(str1, str2));
    }
}
