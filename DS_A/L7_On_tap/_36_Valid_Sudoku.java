import java.util.ArrayList;
import java.util.List;

public class _36_Valid_Sudoku {
    public static void main(String[] args) {
        char[][] board = { { '.', '2', '.', '.', '.', '5', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '4', '.', '.', '.' }, { '.', '.', '.', '9', '.', '.', '7', '.', '.' },
                { '.', '.', '8', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '7', '4', '3', '.', '9' }, { '.', '.', '.', '.', '.', '.', '9', '.', '.' },
                { '.', '7', '.', '.', '6', '.', '.', '.', '5' }, { '3', '.', '.', '7', '.', '.', '.', '.', '.' }

        };

        boolean result = isValidSudoku(board);
        System.out.println(result);
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            List<Character> rowChecker = new ArrayList<Character>();
            List<Character> columnChecker = new ArrayList<Character>();

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && rowChecker.contains(board[i][j])) {
                    return false;
                } else if (board[i][j] != '.') {
                    rowChecker.add(board[i][j]);
                }
                if (board[j][i] != '.' && columnChecker.contains(board[j][i])) {
                    return false;
                } else if (board[j][i] != '.') {
                    columnChecker.add(board[j][i]);
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                List<Character> boxChecker = new ArrayList<Character>();
                for (int k = 0; k < 9; k++) {
                    if (board[i + k / 3][j + k % 3] != '.' && boxChecker.contains(board[i + k / 3][j + k % 3])) {
                        return false;
                    } else if (board[i + k / 3][j + k % 3] != '.') {
                        boxChecker.add(board[i + k / 3][j + k % 3]);
                    }
                }
            }
        }

        return true;
    }

}
