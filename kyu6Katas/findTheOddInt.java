public class FindOdd {
	public static int findIt(int[] a) {
    int result = 0;
        for (int num : a) {
            result ^= num;
        }
        return result;
  }
}
