import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> result = new ArrayList<>();

        for (int elementA : a) {
            if (!containsElement(b, elementA)) {
                result.add(elementA);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean containsElement(int[] array, int element) {
        for (int value : array) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] result1 = arrayDiff(new int[]{1, 2}, new int[]{1});
        System.out.println(Arrays.toString(result1)); // Output: [2]

        int[] result2 = arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2});
        System.out.println(Arrays.toString(result2)); // Output: [1, 3]
    }
}
