public class Kata
{
    public static String expandedForm(int num)
    {
      String numStr = String.valueOf(num);
        StringBuilder expandedForm = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit != 0) {
                if (expandedForm.length() > 0) {
                    expandedForm.append(" + ");
                }
                expandedForm.append(digit * (int) Math.pow(10, numStr.length() - 1 - i));
            }
        }
        
        return expandedForm.toString();
    }
}
