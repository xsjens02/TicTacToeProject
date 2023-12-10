import java.util.Scanner;
public class Player {
    public static int playerCount = 0;
    private String playerName;
    private final char playerChar;
    public Player() {
        playerCount++;
        setPlayerName();
        if (playerCount == 1) {
            playerChar = 'x';
        } else {
            playerChar = 'o';
        }
    }
    public void setPlayerName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Player" + playerCount + " name: ");
        this.playerName = in.next();
    }
    public char getPlayerChar() {
        return this.playerChar;
    }
    public String getPlayerName() {
        return this.playerName;
    }
}
