// import Mark;

enum Mark { BLANK, X, O };

class Board {

  public static final int SIZE = 3;
  public static final int WIN_STREAK = 3;
  private static final Mark[][] boardMap = new int[SIZE][SIZE];
  
  public Board () {
    for (int row = 0; row < SIZE; ++ row) {
      for (int col = 0; col < SIZE; ++ col) {
        boardMap[row][col] = Mark.BLANK;
      }
    }
  };
  
  public boolean putMark (Mark mark, int row, int col) {
    if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
      return false;
    };

    if (boardMap[row][col] != Mark.BLANK) {
      return false;
    }

    boardMap[row][col] = mark;

    return true;
  };

  public Mark getMark (int row, int col) {
    if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
      return Mark.BLANK;
    };

    return boardMap[row][col];
  };

  private boolean isGmaeEnded () {
    return false;
  };


  public static int getSize () {
    return SIZE;
  };
}
