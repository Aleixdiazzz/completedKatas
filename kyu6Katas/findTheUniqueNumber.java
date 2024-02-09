import java.util.Arrays;
 
public class Kata {
    public static double findUniq(double arr[]) {
      double num1 = arr[0];
        double num2 = arr[1];
        int count1 = 1;
        int count2 = 1;
        for (int i = 2; i < arr.length; i++) {
            double current = arr[i];
            if (current == num1) {
                count1++;
            } else if (current == num2) {
                count2++;
            } else {
                return current;
            }
        }
        return (count1 == 1) ? num1 : num2;
    
    }
}
