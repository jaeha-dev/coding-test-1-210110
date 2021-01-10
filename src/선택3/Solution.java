package 선택3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3. 친구 찾기
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findFriends(new String[]{"Ryan", "Kieran", "Mark"}))); // Ryan, Mark

        System.out.println(Arrays.toString(findFriends(new String[]{"Apple", "Banana", "Kiwi", "Melon", "Pear"}))); // Kiwi, Pear
    }

    static String[] findFriends(String[] users) {
        List<String> friends = new ArrayList<>();
        for (String user : users) {
            if (user.replaceAll(" " , "").length() == 4) {
                friends.add(user);
            }
        }

        return friends.toArray(new String[0]);
    }
}