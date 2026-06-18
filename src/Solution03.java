import java.util.HashMap;
import java.util.Map;

public class Solution03 {
    public String solution(String[] participant, String[] completion) {
        // System.out.println()
        // Arrays.toString()
        // 1단계 : 참여자 카운트
        Map<String, Integer> map = new HashMap<>();
        // System.out.println("participant " + Arrays.toString(participant));
        for (String p : participant) {
            // map.put(p, 1);
            // map.put(p, map.get("p") + 1); // NullPointerException
            // if (map.containsKey(p)) {
            //     map.put(p, map.get("p") + 1);
            // } else {
            //     map.put(p, 1);
            // }
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        // System.out.println(map);
        // System.out.println("completion " + Arrays.toString(completion));
        for (String c : completion) {
            // map.put(p, 1);
            // map.put(p, map.get("p") + 1); // NullPointerException
            // if (map.containsKey(p)) {
            //     map.put(p, map.get("p") + 1);
            // } else {
            //     map.put(p, 1);
            // }
            map.put(c, map.get(c) - 1);
        }
        // System.out.println(map);
        // 2단계 : 완주자 카운트 (참여자 카운트에서 뺄 것임)
        // -> 0이 아닌 이름은 동명이인과 상관없이 완주하지 못한 선수.
        for (String key : map.keySet()) {
            // System.out.println(key);
            if (map.get(key) != 0) {
                return key;
            }
        }
        // String answer = "";
        // return answer;
        return "";
    }
}