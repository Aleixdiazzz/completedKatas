public class Kata {
    public static String encryptThis(String message) {
      if (message == null || message.isEmpty()) {
            return "";
        }

        String[] words = message.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(encryptWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private static String encryptWord(String word) {
        if (word.length() == 0) {
            return "";
        }

        int asciiCode = (int) word.charAt(0);

        if (word.length() > 1) {
            char[] chars = word.toCharArray();
            char temp = chars[1];
            chars[1] = chars[chars.length - 1];
            chars[chars.length - 1] = temp;
            return asciiCode + new String(chars, 1, chars.length - 1);
        } else {
            return String.valueOf(asciiCode);
        }
    }
}
