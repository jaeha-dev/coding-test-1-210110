package 선택2;

import java.util.*;
import java.util.stream.Collectors;

// 2. 중간 숫자 찾기
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 2})); // 1
        System.out.println(solution(new int[]{5, 1, 2})); // 2

        System.out.println(solution(new int[]{4, 2, 3})); // 2
        System.out.println(solution(new int[]{1, 5, 2})); // 2
        System.out.println(solution(new int[]{4, 6, 2})); // 0
    }

    static int solution(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        // list에서 최대 값과 인덱스를 찾아 0으로 바꾼다.
        int max = Collections.max(list);
        list.set(list.indexOf(max), 0);

        // list에서 다시 최대 값을 찾고 인덱스를 출력한다. (이때 최대 값은 두 번째로 큰 값이다.)
        max = Collections.max(list);
        return list.indexOf(max);
    }
}