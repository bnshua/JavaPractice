import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        char[][]board = new char[3][3];
        Random rand = new Random();
        int xCount = 0;
        int oCount = 0;
        for (int row = 0; row < 3; row++ ) {
            for (int col = 0; col < 3; col++) {
                int r = rand.nextInt(2);
                if (r == 1 && xCount < 5) {
                    board[row][col] = 'X';
                    xCount++;
                } else {
                    board [row][col] = 'O';
                    oCount++;
                }
            }
        }
        System.out.println("Board");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
//part 2 where it checks
        boolean xWins = false;
        boolean oWins = false;
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                if (board[i][0] == 'X') xWins = true;
                if (board[i][0] == 'O') oWins = true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == 'X') xWins = true;
                if (board[0][i] == 'O') oWins = true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 'X') xWins = true;
            if (board[0][0] == 'O') oWins = true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 'X') xWins = true;
            if (board[0][2] == 'O') oWins = true;
        }
        if (xWins) {
            System.out.println("X wins!");
        } else if (oWins) {
            System.out.println("O wins!");
        } else {
            System.out.println("It's a draw (cat's game).");
        }
    }

}
