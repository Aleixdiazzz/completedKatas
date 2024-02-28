public class Connect4 {

    private int[][] board = new int[6][7];
    private boolean player1 = true;
    private boolean won = false;
    private int currentPlayer;

    public String play(int column) {
        if (won) {
            return "Game has finished!";
        }

        if (!isValidColumn(column)) {
            return "Column full!";
        }

        currentPlayer = (player1) ? 1 : 2;
        dropDisc(column);
        checkForWin();

        player1 = !player1;
        return (won) ? "Player " + currentPlayer + " wins!" : "Player " + currentPlayer + " has a turn";
    }

    private boolean isValidColumn(int column) {
        return board[0][column] == 0;
    }

    private void dropDisc(int column) {
        for (int i = 5; i >= 0; i--) {
            if (board[i][column] == 0) {
                board[i][column] = currentPlayer;
                break;
            }
        }
    }

    private void checkForWin() {
        checkHorizontal();
        checkVertical();
        checkDiagonalLeft();
        checkDiagonalRight();
    }

    private void checkHorizontal() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i][j + 1] && board[i][j] == board[i][j + 2] && board[i][j] == board[i][j + 3]) {
                    won = true;
                }
            }
        }
    }

    private void checkVertical() {
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 2][j] && board[i][j] == board[i + 3][j]) {
                    won = true;
                }
            }
        }
    }

    private void checkDiagonalLeft() {
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i + 1][j + 1] && board[i][j] == board[i + 2][j + 2] && board[i][j] == board[i + 3][j + 3]) {
                    won = true;
                }
            }
        }
    }

    private void checkDiagonalRight() {
        for (int i = 5; i >= 3; i--) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i - 1][j + 1] && board[i][j] == board[i - 2][j + 2] && board[i][j] == board[i - 3][j + 3]) {
                    won = true;
                }
            }
        }
    }
}
