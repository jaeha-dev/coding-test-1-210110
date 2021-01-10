package 선택4;

import java.util.Arrays;

// 4. 아이큐 테스트
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("2 4 7 8 10")); // 3 (3번째 숫자(7)만 홀수이다.)
        System.out.println(solution("1 2 1 1")); // 2 (2번째 숫자(2)만 짝수이다.)

        System.out.println(solution("3 4 5 5")); // 2 (2번째 숫자(4)만 짝수이다.)
        System.out.println(solution("8 4 2 4 7 12")); // 5 (5번째 숫자(7)만 홀수이다.)
    }

    static int solution(String numbers) {
        int[] array = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int idx = 0;
        boolean isOdd = (array[0] % 2) != 0; // 배열의 첫 번째 값에 따라 플래그 값을 지정한다.

        for (int i = 0; i < array.length; i++) {
            if (isOdd && array[i] % 2 == 0) {
                idx = i + 1;

            } else if (!isOdd && array[i] % 2 != 0) {
                idx = i + 1;
            }
        }

        return idx;
    }
}