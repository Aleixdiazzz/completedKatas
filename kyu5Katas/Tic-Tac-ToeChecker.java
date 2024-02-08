public class Solution {

    public static int isSolved(int[][] board) {
      //check for x horizontally
        if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1){
          return 1;
        }
      if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1){
          return 1;
        }
       if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1){
          return 1;
        }
      //check for x vertically
       if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1){
          return 1;
        }
      if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1){
          return 1;
        }
      if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1){
          return 1;
        }
      // check diagonals for x
      if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1){
          return 1;
        }
      if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1){
          return 1;
        }
      
      
      //check for 0 horizontally
        if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2){
          return 2;
        }
      if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2){
          return 2;
        }
       if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2){
          return 2;
        }
      //check for 0 vertically
       if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2){
          return 2;
        }
      if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2){
          return 2;
        }
      if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2){
          return 2;
        }
      // check diagonals for 0
      if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2){
          return 2;
        }
      if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2){
          return 2;
        }
      
      
    
            //check if board is completed
      for (int i = 0; i < board.length; i++){
        if (board[0][i] == 0 || board[1][i] == 0 || board[2][i] == 0){
          return -1;
        }
      }
        return 0;
    }

}
