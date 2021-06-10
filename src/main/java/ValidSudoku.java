import java.util.HashSet;

public class ValidSudoku {

  public boolean isValidSudoku(char[][] board) {

    for (int i = 0; i < 9; i++) {
      char[] row = board[i];
      if (!isValid(row)) {
        return false;
      }
      char[] col = new char[9];
      for (int j = 0; j < 9; j++) {
        col[j] = board[i][j];
      }
      if (!isValid(col)) {
        return false;
      }
    }

    for (int i = 1; i < 8; i++) {
      for (int j = 1; j < 8; j++) {
        char[] subBoxes = getSubBoxes(board, i, j);
        if (!isValid(subBoxes)) {
          return false;
        }
      }
    }

    return true;
  }

  private char[] getSubBoxes(char[][] board, int i, int j) {
    char[] charArr = new char[9];
    int index = -1;
    for (int k = -1; k <= 1; k++) {
      for (int l = -1; l <= 1; l++) {
        charArr[++index] = board[i + k][j + l];
      }
    }
    return charArr;
  }

  private boolean isValid(char[] charArr) {
    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      char item = charArr[i];
      if ('.' == item) {
        continue;
      }
      if (set.contains(item)) {
        return false;
      } else {
        set.add(item);
      }
    }
    return true;
  }

}
