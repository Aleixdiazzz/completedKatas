import java.util.*;
import java.util.List;
import java.util.regex.*;
public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
   int counter = 0;
        String smileyPattern = "^[;:][-~]?[)D]$";

        for (String str : arr) {
            if (Pattern.matches(smileyPattern, str)) {
                counter++;
                System.out.println(str);
            }
        }

        return counter;
  }
}
