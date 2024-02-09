public class Kata {
  public static int findEvenIndex(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
            if (sumOfLeft(arr, i) == sumOfRight(arr, i)) {
                return i;
            }
        }
        return -1;
    }

    private static int sumOfLeft(int[] arr, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int sumOfRight(int[] arr, int index) {
        int sum = 0;
        for (int i = index + 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
