

/**
 * Class Board has a 2D array of chahracters and a counter to keep track
 * of the number of marks. methods used to show a simplied 2D representation of the boards
 * by printing hyphens and spaces and column and row labels.
 * gets the marks from the players and adds them to the boards.
 * checks if the boards is full, as well as displaying the winner i.e., player
 * with O assigned or player with X assigned if they make the 3 characters in
 * the same row or column or diagonally. Also clear the board for the new game.
 *
 */

public class Board implements Constants {
    /**
     * Board is a 2D array of characters.
     */
    private char theBoard[][];

    /**
     * Keeps track of number of occurences
     */
    private int markCount;


    /**
     * Constructor for class Board. The boards will be constructed
     * as a 3 by 3 board containg 9 places for our game.
     */
    public Board() {
        markCount = 0;
        theBoard = new char[3][];
        for (int i = 0; i < 3; i++) {
            theBoard[i] = new char[3];
            for (int j = 0; j < 3; j++)
                theBoard[i][j] = SPACE_CHAR;
        }
    }


    /**
     *
     * @param row the row in the board to assign the mark
     * @param col the column in the board to assign the mark
     * @return returns the position in which the mark will be displayed
     */
    public char getMark(int row, int col) {
        return theBoard[row][col];
    }

    /**
     *
     * @return returns a boolean value of true if the boards is full
     * and false when there are still empty spaces in the board.
     */

    public boolean isFull() {
        return markCount == 9;
    }

    /**
     *
     * @return returns true if the player with the Letter X wins, otherwise is a false boolean type
     */
    public boolean xWins() {
        if (checkWinner(LETTER_X) == 1)
            return true;
        else
            return false;
    }

    /**
     *
     * @return returns True of the player with the O natation wins, othewrwise reyrns false.
     */
    public boolean oWins() {
        if (checkWinner(LETTER_O) == 1)
            return true;
        else
            return false;
    }

    /**
     * this method uses the displayColumnHeaders method to first display the deafault
     * empty boards and then adds the marks prompted from the users repsectively.
     */
    public void display() {
        displayColumnHeaders();
        addHyphens();
        for (int row = 0; row < 3; row++) {
            addSpaces();
            System.out.print("    row " + row + ' ');
            for (int col = 0; col < 3; col++)
                System.out.print("|  " + getMark(row, col) + "  ");
            System.out.println("|");
            addSpaces();
            addHyphens();
        }
    }

    /**
     *
     * @param row the desired row from the player
     * @param col the desired column from the player
     * @param mark after identifying the row and the column, assigns the mark, either O or X to the board.
     */
    public void addMark(int row, int col, char mark) {

        theBoard[row][col] = mark;
        markCount++;
    }

    /**
     * This method clears the board. for all the 9 positions assigns the space character.
     */
    public void clear() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                theBoard[i][j] = SPACE_CHAR;
        markCount = 0;
    }

    /**
     * this method by going through the columns and headers, checks weather player with mark X or
     * player with mark O has won the game. this is done by checking whether there 3 consecutive marks
     * in any row or column or the 2 diagonals in the boards
     * @param mark the mark character parameter
     * @return returns an integer equal to 1 if the player wins
     */
    int checkWinner(char mark) {
        int row, col;
        int result = 0;

        for (row = 0; result == 0 && row < 3; row++) {
            int row_result = 1;
            for (col = 0; row_result == 1 && col < 3; col++)
                if (theBoard[row][col] != mark)
                    row_result = 0;
            if (row_result != 0)
                result = 1;
        }


        for (col = 0; result == 0 && col < 3; col++) {
            int col_result = 1;
            for (row = 0; col_result != 0 && row < 3; row++)
                if (theBoard[row][col] != mark)
                    col_result = 0;
            if (col_result != 0)
                result = 1;
        }

        if (result == 0) {
            int diag1Result = 1;
            for (row = 0; diag1Result != 0 && row < 3; row++)
                if (theBoard[row][row] != mark)
                    diag1Result = 0;
            if (diag1Result != 0)
                result = 1;
        }
        if (result == 0) {
            int diag2Result = 1;
            for (row = 0; diag2Result != 0 && row < 3; row++)
                if (theBoard[row][3 - 1 - row] != mark)
                    diag2Result = 0;
            if (diag2Result != 0)
                result = 1;
        }
        return result;
    }

    /**
     *  By printing a series of space characters and | characters
     * creates the headers for the coulmn part of the board.
     */
    void displayColumnHeaders() {
        System.out.print("          ");
        for (int j = 0; j < 3; j++)
            System.out.print("|col " + j);
        System.out.println();
    }

    /**
     * adds hyphens to seperate the rows
     */
    void addHyphens() {
        System.out.print("          ");
        for (int j = 0; j < 3; j++)
            System.out.print("+-----");
        System.out.println("+");
    }

    /**
     * adds spaces and | characters to sperate the columns
     */
    void addSpaces() {
        System.out.print("          ");
        for (int j = 0; j < 3; j++)
            System.out.print("|     ");
        System.out.println("|");
    }
}
