public class BouncingBall {
	
	public static int bouncingBall(double h, double bounce, double window) {
	  if (h > 0 && (bounce > 0 && bounce < 1) && window < h) {
            int count = 1;
            double currentHeight = h * bounce;
            while (currentHeight > window) {
                count += 2; 
                currentHeight *= bounce;
            }
            return count;
        } else {
            return -1;
      }
	}
}
