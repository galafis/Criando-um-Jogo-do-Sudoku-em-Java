public class SudokuBoard {
    private Cell[][] board;

    public SudokuBoard() {
        board = new Cell[9][9];
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                board[y][x] = new Cell(0, false);
            }
        }
    }

    public void setCell(int x, int y, int value, boolean isFixed) {
        board[y][x] = new Cell(value, isFixed);
    }

    public boolean setUserValue(int x, int y, int value) {
        if (!board[y][x].isFixed()) {
            board[y][x].setValue(value);
            return true;
        }
        return false;
    }

    public void displayBoard() {
        for (int y = 0; y < 9; y++) {
            if (y % 3 == 0 && y != 0) System.out.println("------+-------+------");
            for (int x = 0; x < 9; x++) {
                if (x % 3 == 0 && x != 0) System.out.print("| ");
                System.out.print(board[y][x] + " ");
            }
            System.out.println();
        }
    }
}

