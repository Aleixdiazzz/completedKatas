import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        String lowercaseInput = text.toLowerCase();

        for (char c : lowercaseInput.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        int repeatedCount = 0;
        for (int count : charCountMap.values()) {
            if (count > 1) {
                repeatedCount++;
            }
        }

        return repeatedCount;
  }
}
