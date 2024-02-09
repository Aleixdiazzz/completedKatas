public class Tortoise {
    public static int[] race(int v1, int v2, int lead) {
       if (v1 >= v2) {
            return null;
        }

        int timeInSeconds = (lead * 3600) / (v2 - v1);


        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds % 3600) / 60;
        int seconds = timeInSeconds % 60;

        return new int[]{hours, minutes, seconds};
    }

    public static void main(String[] args) {
        int[] result1 = race(720, 850, 70);
        System.out.println(resultToString(result1));

        int[] result2 = race(80, 91, 37);
        System.out.println(resultToString(result2));
    }

    private static String resultToString(int[] result) {
        if (result == null) {
            return "nil";
        }
        return String.format("[%d, %d, %d]", result[0], result[1], result[2]);
    }
}
