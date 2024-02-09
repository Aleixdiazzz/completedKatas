import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {    
        Map<Character, Integer> countMap1 = getCharacterCountMap(str1);
        Map<Character, Integer> countMap2 = getCharacterCountMap(str2);

        for (Map.Entry<Character, Integer> entry : countMap2.entrySet()) {
            char character = entry.getKey();
            int countInStr2 = entry.getValue();

            if (!countMap1.containsKey(character) || countMap1.get(character) < countInStr2) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> getCharacterCountMap(String str) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        return countMap;
    }
}
