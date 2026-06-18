import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution01 {
    public int[] solution(int[] array, int[][] commands) {
        // public int[] solution(int[] arr, int[][] commands) {
        // 내가 편한 매개변수 이름으로 바꿔도 된다
        // int[] array -> i, j => k => answer

        // array = {1, 5, 2, 6, 3, 7, 4
        // i = 2, j = 5 / k = 3
        // 시작점, 끝점 -> 내장된 기능은 일반적으로 끝점을 제외
        // 번째 -> 시작이 1임.

        // i, j, k -> commands => 다중배열 {{i1, j1, k1}, {i2, j2, k2}, ...}
        // ----------- 매개변수, 인자 -------
        // System.out.println(array); // [I@573fd745
        // System.out.println("array : " + Arrays.toString(array));
        // commands : [[I@15327b79, [I@4f2410ac, [I@722c41f4]
        // System.out.println("commands : " + Arrays.toString(commands));
        // System.out.println("commands : " + Arrays.deepToString(commands));

        // for (int i = 0; i < array.length; i++) {
        //     System.out.println("i : " + i);
        //     System.out.println("array[i] : " + array[i]);
        // }

        // for (int i = 0; i < commands.length; i++) {
        List<Integer> answerList = new ArrayList<>();
        for (int[] command : commands) {
            // System.out.println("i : " + i);
            // System.out.println("commands[i] : " + commands[i]);
            // for (int j = 0; j < commands[0].length; j++) {
            //     System.out.println("i : " + i + " j : " + i);
            //     System.out.println("commands[i][j] : " + commands[i][j]);
            // }
            //int[] command = commands[i];
            int i = command[0];
            int j = command[1];
            int k = command[2];
            // System.out.println("i : " + i + " j : " + j + " k : " + k);
            // for (int ii = 0; ii < array.length; ii++) {
            List<Integer> list = new ArrayList<>();
            for (int ii = i - 1; ii < j; ii++) {
                // 인덱스는 0부터 시작하는데 여기서 주어지는 값은 1부터 시작함
                // System.out.println("v : " + array[ii]);
                list.add(array[ii]);
            }
            // System.out.println(list);
            list.sort(Comparator.naturalOrder());
            // 오름차순, 데이터가 등장하는 방향이 곧 데이터가 크다고 분류되는 정렬의 형식
            // System.out.println(list);
            // System.out.println("답 : " + list.get(k - 1)); // 인덱스이므로 k값에서 -1
            answerList.add(list.get(k - 1));
        }

        // int[] answer = {};
        int[] answer = new int[commands.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer; // 나중에 가면 stream 등으로 한 번에 변환할 수도 있다
    }
}