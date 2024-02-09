public class Kata
{
  public static char findMissingLetter(char[] array){
    int index = 0;
    char[] alphabet = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                      'l', 'm', 'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
                       'w', 'x', 'y','z'};
    
    
    if (Character.isUpperCase(array[0])){
      for (int i = 0; i < alphabet.length; i++){
        alphabet[i] = Character.toUpperCase(alphabet[i]);
      }
    }
  
    
    while (alphabet[index] != array[0]){
      index++;
    }
    
    for (int i = 0; i < array.length; i++){
      if (array[i] != alphabet[index]){
        return alphabet[index];
      }
      index++;
    }
    return 'x';
  }
}
