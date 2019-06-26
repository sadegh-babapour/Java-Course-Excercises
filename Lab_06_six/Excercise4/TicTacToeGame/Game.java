
import java.io.*;



/**
 * Game has a board class, uses the Constants interface and has plaeyrs who play the games
 * and a referee who monintors the game.
 */
public class Game implements Constants {

    /**
     *  This is the board
     */
    private Board theBoard;
    /**
     * This is the Referee
     */
    private Referee theRef;

    /**
     * Constructor of the class Game. the constructor creates a new instance of the class board
     * for the game. In other words the game is composed of class Board
     */
    public Game( ) {
        theBoard  = new Board();
    }

    /**
     *
     * @param r r is assigned to Referee
     * @throws IOException Handles any erros that might arise
     */
    public void appointReferee(Referee r) throws IOException {
        theRef = r;
        theRef.runTheGame();
    }

    /**
     *
     * @param args arguments in the main method
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Referee theRef;
        Player xPlayer, oPlayer;
        BufferedReader stdin;
        Game theGame = new Game();
        stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nPlease enter the name of the \'X\' player: ");
        String name= stdin.readLine();
        while (name == null) {
            System.out.print("Please try again: ");
            name = stdin.readLine();
        }

        xPlayer = new Player(name, LETTER_X);
        xPlayer.setBoard(theGame.theBoard);

        System.out.print("\nPlease enter the name of the \'O\' player: ");
        name = stdin.readLine();
        while (name == null) {
            System.out.print("Please try again: ");
            name = stdin.readLine();
        }

        oPlayer = new Player(name, LETTER_O);
        oPlayer.setBoard(theGame.theBoard);

        theRef = new Referee(xPlayer,oPlayer, theGame.theBoard);
        theRef.setBoard(theGame.theBoard);
        theRef.setoPlayer(oPlayer);
        theRef.setxPlayer(xPlayer);

        theGame.appointReferee(theRef);
    }


}
