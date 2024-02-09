public class Multiplication{
  public static int [][] multiplicationTable(int n){
    int a = 1;
    int[][] table = new int[n][n];
    for (int j = 0;  j < table.length; j++){
      for (int i = 0; i < table.length; i++){
        table[i][j] = a * (i + 1);
      }
      a++;
    }
    return table;
  }
}
