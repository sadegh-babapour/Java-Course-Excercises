public class Referee {

    private Player xPlayer;

    private Player oPlayer;


    private Board board;

    public Referee(Player xPlayer, Player oPlayer, Board board) {
        this.xPlayer = xPlayer;
        this.oPlayer = oPlayer;
        this.board = board;
    }





    public void runTheGame() {
        xPlayer.setOpponent(oPlayer);
        board.display();
        while (board.xWins() == false || board.oWins() == false || !board.isFull()){
//            board.display();
//            board.display();
            if (board.isFull() == true) {
                System.out.println(" Game ended in a tie! ");
                break;
            }
            xPlayer.play();
            if (board.checkWinner(Constants.LETTER_X) == 1) {
                System.out.println("game over Player " + xPlayer.getName() + " won");
                break;
            }
            oPlayer.play();
//            board.display();
            if (board.checkWinner(Constants.LETTER_O) == 1) {
                System.out.println("game over Player " + oPlayer.getName() + " won");
                break;
            }


        }

        System.out.println("Game over!");
//        oPlayer.play();
    }

    public void setxPlayer(Player xPlayer) {
        this.xPlayer = xPlayer;
    }

    public void setoPlayer(Player oPlayer) {
        this.oPlayer = oPlayer;
    }

    public void setBoard(Board board) {
        this.board = board;
    }


}