package 필수2;

import java.util.Arrays;

// 2. 사용하지 않는 가장 작은 숫자 찾기
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 2, 4})); // 3
        System.out.println(solution(new int[]{0, 1, 2, 3, 4, 5, 6})); // 7

        System.out.println(solution(new int[]{0, 2, 2, 4})); // 1
        System.out.println(solution(new int[]{0, 1, 2, 3})); // 4
        System.out.println(solution(new int[]{0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1})); // 3
    }

    static int solution(int[] ids) {
        // 오름차순 정렬
        Arrays.sort(ids);
        return find(ids, 0, ids.length - 1);
    }

    // example 1
    // arr = [0, 1, 2, 3], ret == return
    // s: 0, e: 3 -> m: 1 -> [C] ret find(arr, 1 + 1, 3)
    // s: 2, e: 3 -> m: 2 -> [C] ret find(arr, 2 + 1, 3)
    // s: 3, e: 3 -> m: 3 -> [C] ret find(arr, 3 + 1, 3)
    // s: 4, e: 3 -> [A] ret 3 + 1 [print 4]

    // example 2
    // arr = [0, 1, 2, 4], ret == return
    // s: 0, e: 3 -> m: 1 -> [C] ret find(arr, 1 + 1, 3)
    // s: 2, e: 3 -> m: 2 -> [C] ret find(arr, 2 + 1, 3)
    // s: 3, e: 3 -> [B] ret 3 [print 3]

    // example 3
    // arr = [0, 1, 2, 2, 2], ret == return
    // s: 0, e: 4 -> m: 2 -> [C] ret find(arr, 2 + 1, 4)
    // s: 3, e: 4 -> [B] ret 3

    // example 4
    // arr = [0, 1, 2], ret == return
    // s: 0, e: 2 -> m: 1 -> [C] ret find(arr, 1 + 1, 2)
    // s: 2, e: 2 -> m: 2 -> [C] ret find(arr, 2 + 1, 2)
    // s: 3, e: 2 -> [A] ret 3

    static int find(int[] ids, int start, int end) {
        if (start > end) { // [A]
            return end + 1;
        }
        if (start != ids[start]) { // [B]
            return start;
        }

        int middle = (start + end) / 2;

        if (ids[middle] == middle) { // [C]
            return find(ids, middle + 1, end);
        }

        return find(ids, start, middle);
    }
}