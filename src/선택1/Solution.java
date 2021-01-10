package 선택1;

// 1. 모음 찾기
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("abracadabra")); // 5

        System.out.println(solution("necessity")); // 3
        System.out.println(solution("congress")); // 2
    }

    static int solution(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }

        return count;
    }
}