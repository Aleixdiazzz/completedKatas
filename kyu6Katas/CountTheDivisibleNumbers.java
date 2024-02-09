public class Kata {

  public static long divisibleCount(long x, long y, long k) {
    if (x % k != 0) {
        x = x + (k - x % k);
    }
    
    if (y < x) {
        return 0;
    }

    return 1 + (y - x) / k;
  }  
}
