import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectFour {

    public static String whoIsWinner(List<String> moves) {
        char[][] grid = new char[6][7];

        for (String move : moves) {
            String[] parts = move.split("_");
            char color = parts[1].charAt(0);
            int column = getColumnIndex(parts[0]);
            
            int row = dropPiece(grid, column, color);
            if (checkWinner(grid, row, column, color)) {
                return (color == 'Y') ? "Yellow" : "Red";
            }
        }

        return "Draw";
    }

    private static int getColumnIndex(String column) {
        return column.charAt(0) - 'A';
    }

    private static int dropPiece(char[][] grid, int column, char color) {
        for (int row = grid.length - 1; row >= 0; row--) {
            if (grid[row][column] == 0) {
                grid[row][column] = color;
                return row;
            }
        }
        return -1; // Column is full, shouldn't happen in Connect Four.
    }

    private static boolean checkWinner(char[][] grid, int row, int column, char color) {
        // Check horizontally
        int count = 0;
        for (int i = Math.max(0, column - 3); i <= Math.min(6, column + 3); i++) {
            if (grid[row][i] == color) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        // Check vertically
        count = 0;
        for (int i = Math.max(0, row - 3); i <= Math.min(5, row + 3); i++) {
            if (grid[i][column] == color) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        // Check diagonally (from top-left to bottom-right)
        count = 0;
        for (int i = -3; i <= 3; i++) {
            int r = row + i;
            int c = column + i;
            if (r >= 0 && r < 6 && c >= 0 && c < 7) {
                if (grid[r][c] == color) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Check diagonally (from top-right to bottom-left)
        count = 0;
        for (int i = -3; i <= 3; i++) {
            int r = row - i;
            int c = column + i;
            if (r >= 0 && r < 6 && c >= 0 && c < 7) {
                if (grid[r][c] == color) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));

        String winner = whoIsWinner(myList);
        System.out.println("Winner: " + winner);
    }
}
