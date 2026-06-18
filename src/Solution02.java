import java.util.HashSet;
import java.util.Set;

public class Solution02 {
    public int solution(int[] nums) {
        // System.out.println(Arrays.toString(nums));
        // N마리의 폰켓몬이 있는데, 이중에 최대 N/2마리가 최대.
        int N = nums.length;
        // int max = N / 2;
        // System.out.println("N : " + N + " max : " + max);
        // int answer = 0;
        // int answer = max;
        // 가장 많은 종류의 폰켓몬을 선택하는 방법
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // System.out.println(set);
        // int max2 = set.size();
        // if (answer > max2) {
        //     return max2;
        // }
        // return answer;
        return Math.min(N / 2, set.size());
    }
}