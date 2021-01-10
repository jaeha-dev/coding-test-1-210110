package 필수3;

import java.util.Arrays;

// 3. 승점구하기
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"3:1", "2:2", "1:3"})); // 4

        System.out.println(solution(new String[]{"2:0", "3:4", "4:1", "1:2", "3:3"})); // 7
    }

    static int solution(String[] games) {
        int score = 0;

        for (String game : games) {
            int[] records = Arrays.stream(game.split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (records[0] < records[1]) continue;
            if (records[0] > records[1]) score += 3;
            if (records[0] == records[1]) score += 1;
        }

        return score;
    }
}