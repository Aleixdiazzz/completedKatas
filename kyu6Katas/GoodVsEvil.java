public class GoodVsEvil {
  public static String battle(String goodAmountsStr, String evilAmountsStr) {
    int sumOfGood = 0;
    int sumOfBad = 0;
    
    String[] goodAmounts = goodAmountsStr.split("\\s+");
    String[] evilAmounts = evilAmountsStr.split("\\s+");
    

    
    for (int i = 0; i < goodAmounts.length; i++){
      if (i == 0){
        sumOfGood = sumOfGood + (1 * Integer.parseInt(goodAmounts[i]));
      }
      if (i == 1){
        sumOfGood = sumOfGood + (2 * Integer.parseInt(goodAmounts[i]));
      }
      if (i == 2){
        sumOfGood = sumOfGood + (3 * Integer.parseInt(goodAmounts[i]));
      }
      if (i == 3){
        sumOfGood = sumOfGood + (3 * Integer.parseInt(goodAmounts[i]));
      }
      if (i == 4){
        sumOfGood = sumOfGood + (4 * Integer.parseInt(goodAmounts[i]));
      }
      if (i == 5){
        sumOfGood = sumOfGood + (10 * Integer.parseInt(goodAmounts[i]));
      }
      }
    
    
      
      for (int i = 0; i < evilAmounts.length; i++){
      if (i == 0){
        sumOfBad = sumOfBad + (1 * Integer.parseInt(evilAmounts[i]));
      }
      if (i == 1){
        sumOfBad = sumOfBad + (2 * Integer.parseInt(evilAmounts[i]));
      }
      if (i == 2){
        sumOfBad = sumOfBad + (2 * Integer.parseInt(evilAmounts[i]));
      }
      if (i == 3){
        sumOfBad = sumOfBad + (2 * Integer.parseInt(evilAmounts[i]));
      }
      if (i == 4){
        sumOfBad = sumOfBad + (3 * Integer.parseInt(evilAmounts[i]));
      }
      if (i == 5){
        sumOfBad = sumOfBad + (5 * Integer.parseInt(evilAmounts[i]));
      }
        if (i == 6){
        sumOfBad = sumOfBad + (10 * Integer.parseInt(evilAmounts[i]));
      }
      }
    
      
      System.out.println(sumOfGood);
      System.out.println(sumOfBad);
        
        if (sumOfGood > sumOfBad){
          return "Battle Result: Good triumphs over Evil";
        }
        if (sumOfGood == sumOfBad){
          return "Battle Result: No victor on this battle field";
        }
    return "Battle Result: Evil eradicates all trace of Good";
  }
}
