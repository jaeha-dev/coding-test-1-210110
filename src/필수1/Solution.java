package 필수1;

// 1. 분기 숫자 구하기
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(3)); // 1
        System.out.println(solution(8)); // 3
        System.out.println(solution(11)); // 4

        System.out.println(solution(6)); // 2
    }

    static int solution(int month) {
        // ceil(): 소수점 이하를 '올림'한다. (1월일 때, 0.333... -> 1)
        return (int) Math.ceil(month / 3.0);
    }
}