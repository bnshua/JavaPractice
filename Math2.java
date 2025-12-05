

class ScoreBoard {

    int playerXP = 0;
    int playerLevel = 0;
    static String gameName = "Labubu Simulator";


    static void gameName() {
        System.out.println("Game Name: " + gameName);
        
    }
    void gainXP(int amount) {
        playerXP = playerXP + amount; 
    }

    void heal() {
        playerXP += 50; 
    }

    void damage() {
        playerXP -= 10; 
    }


    void levelUp() {
        playerLevel++;   
    }

    void levelDown() {
        playerLevel--;    
    }



}

public class Math2 {
    public static void main(String[] args){

        ScoreBoard player1 = new ScoreBoard();

        player1.gainXP(100);
        player1.gainXP(200);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();

        System.out.println("Player 1 XP: " + player1.playerXP);
        System.out.println("Player 1 Level: " + player1.playerLevel);
        ScoreBoard.gameName();

    }
}
