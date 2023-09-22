
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Anagramgroup {
    public static List<List<String>> check(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strings = { "eat", "ate", "tea", "cat", "tac" };
        List<List<String>> result = check(strings);

        // Printing the anagram groups
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
