import java.util.Scanner;

/**
 *
 */
public class Player {
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Board board;
    /**
     *
     */
    private Player opponent;
    /**
     *
     */
    private char mark;

    public Player(String name, char c) {
        this.name = name;
        this.mark = c;
    }


    public void play() {
        while (!board.isFull()) {
            makeMove();
            if (board.checkWinner(Constants.LETTER_X) == 1) {
//                System.out.println("game over Player " + name + " won");
                break;
            } else if (board.checkWinner(Constants.LETTER_O) == 1) {
//                System.out.println("game over Player " + opponent.name + " won");
                break;
            } else if (board.isFull() == true) {
//                System.out.println(" Game ended in a tie! ");
                break;
            }
            else{
//                makeMove();
                break;
            }

        }
    }

    public int getColumn() {
        int column = 0;
        boolean isTrue = true;
        while (isTrue) {
            System.out.print(name + ", what column should your next " + mark + " be placed in? ");
            Scanner sc = new Scanner(System.in);
            column = sc.nextInt();
            while (column < -1 || column >= 3) {
                System.out.println("Must be either 0, 1 or 2. Try again: ");
                column = sc.nextInt();
            }
            isTrue = false;
        }
        return column;
    }

    public int getRow() {
        int row = 0;
        boolean isTrue = true;
        while (isTrue) {
            System.out.print(name + ", what row should your next " + mark + " be placed in? ");
            Scanner sc = new Scanner(System.in);
            row = sc.nextInt();
            while (row < -1 || row >= 3) {
                System.out.println("Must be either 0, 1 or 2. Try again: ");
                row = sc.nextInt();
            }
            isTrue = false;
        }
        return row;
    }


    public void makeMove() {
        int row = getRow();
        int column = getColumn();
        boolean isTrue = true;
        while (isTrue){
            if (board.getMark(row, column) == Constants.SPACE_CHAR) {
                board.addMark(row, column, mark);
                board.display();
                isTrue = false;
            }
            else {
            System.out.println("This position is Already taken, Try another one");
            row = getRow();
            column = getColumn();

            }
        }
    }


//    public void inputMarkx() {
//
//        boolean isTrue = true;
//        while (isTrue) {
//
//            if (board.checkWinner(Constants.LETTER_X) == 1) {
//                System.out.println("game over Player " + name + " won");
//                isTrue = false;
//            } else if (board.isFull() == true) {
//                System.out.println(" Game ended in a tie! ");
//                isTrue = false;
//            } else if (board.checkWinner(Constants.LETTER_O) == 1) {
//                System.out.println("game over Player " + opponent.name + " won");
//                isTrue = false;
//            }
//            System.out.print(name + ", what row should your next " + mark + " be placed in? ");
//            Scanner sc = new Scanner(System.in);
//            int row = sc.nextInt();
//            while (row < -1 || row >= 3) {
//                System.out.println("Must be either 0, 1 or 2. Try again: ");
//                row = sc.nextInt();
//            }
//
//            System.out.print(name + ", what column should your next " + mark + " be placed in? ");
//            int column = sc.nextInt();
//            while (column < -1 || column >= 3) {
//                System.out.println("Must be either 0, 1 or 2. Try again: ");
//                column = sc.nextInt();
//            }
//
//            if (board.getMark(row, column) == Constants.SPACE_CHAR) {
//                board.addMark(row, column, mark);
//                board.display();
//            } else if (board.getMark(row, column) != Constants.SPACE_CHAR) {
//                System.out.println("This position is Already taken, Try another one");
//                inputMarkx();
//            }
//            board.addMark(row, column, mark);
//            board.display();
//        }
//
//    }
//


//    public void inputMarko(){
//
//        System.out.print(opponent.name + ", what row should your next " + opponent.mark + " be placed in? ");
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//
//        while (row<-1 || row >=3){
//            System.out.println("Must be either 0, 1 or 2. Try again: ");
//            row = sc.nextInt();
//        }
//
//        System.out.print(opponent.name + ", what column should your next " + opponent.mark + " be placed in? ");
//        int column = sc.nextInt();
//
//        while (column<-1 || column >= 3){
//            System.out.println("Must be either 0, 1 or 2. Try again: ");
//            column = sc.nextInt();
//        }
//        while (board.getMark(row, column) == Constants.LETTER_X || board.getMark(row, column) == Constants.LETTER_O){
//            System.out.println("This position is Already taken, Try another one");
//            inputMarko();
//        }
//
//        board.addMark(row, column, opponent.mark);
//        board.display();
//    }
//

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

//        public Player getOpponent () {
//            return this.opponent;
//        }

    public void setBoard(Board theBoard) {
        this.board = theBoard;
    }

    public Board getBoard() {
        return this.board;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getMark() {
        return this.mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }


    public Player changeplayer(Player opponent) {
        return opponent;
    }

}