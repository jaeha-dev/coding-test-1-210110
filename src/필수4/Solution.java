package 필수4;

import java.util.concurrent.ThreadLocalRandom;

// 4. 더하고 빼기
public class Solution {

    public static void main(String[] args) {
        // System.out.println(find(5)); // num -> 10 ~ 10000
        System.out.println(find(10));
        System.out.println(find(325));

        System.out.println(find(ThreadLocalRandom.current().nextInt(10, 10000)));
    }

    // 더하고 빼기
    static String find(int num) {
        while (num >= 10) {
            num = num - sum(num);
        }

        // apple의 코드는 9의 배수이다.
        // 10 -> 1 + 0 -> 10 - 1 = 9 (apple)
        // 13 -> 1 + 3 -> 13 - 4 = 9 (apple)
        // 27 -> 2 + 7 -> 27 - 9 = 18 -> 1 + 8 -> 18 - 9 = 9 (apple)
        // 10 ~ 10000일 때 더하고 빼기를 반복하면 반드시 9 또는 99가 나온다.
        return (num % 9 == 0) ? "apple" : "";
    }

    // 자릿수 합계
    static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num = num / 10;
        }

        return sum;
    }
}