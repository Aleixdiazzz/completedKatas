public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) 
  {
    int text_length = text.length();
    String result = "";
    char letter;
    boolean end_comment = false;
    for (int i = 0; i < text_length; i++)
    {
      letter = text.charAt(i);
      if (symbol_check(letter, commentSymbols) && !end_comment)
      {
        if (double_check(text, i))
        {
          result = result.replaceAll("\\s*$", "");          
        }
        end_comment = true;
        continue;
      }
      else if (end_comment)
      {
        if (end_check(letter))
        {                  
          result += '\n';
          end_comment = false;
        }
      }
      else if (letter == '\n')
      {
        if (double_check(text, i))
        {
          result = result.replaceAll("\\s*$", "");
        }
        result += '\n';
      }
      else
      {
        result += letter;
      }
    }
    if (text.length() > 1 && text.charAt(text.length() - 2) != '\n')
    {
      result = result.replaceAll("\\s*$", "");
    }
    return result;
	}
  
	public static boolean symbol_check(char letter, String[] symbols)
  {
    int array_length = symbols.length;
    char symbol;
    for (int j = 0; j < array_length; j++)
    {
      symbol = symbols[j].charAt(0);
      if (letter == symbols[j].charAt(0))
      {
        return true;
      }
    }
    return false;
  }
  
  public static boolean end_check(char letter)
  {
    if (letter == '\n')
    {
      return true;
    }
    return false;
  }
  
  public static boolean double_check(String text, int n)
  {
    return (n != 0 && text.charAt(n - 1) != '\n') ? true : false;
  }
}
