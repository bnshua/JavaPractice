public class Loops {
    

    public static void main(String[] args) {

        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++) {
                
                System.out.print(j);

            }
            System.out.print('\n');
        }

        
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        boolean isContinuing = true;
        int z = 0;
        
        while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }




        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("foobar");
            } else if (x % 3 == 0) {
                System.out.println("foo");
            } else if (x % 5 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(x);
            }
        }



        for (int row = 1; row <= 12; row++) {
            for (int col = 1; col <= 12; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }



        // Challenge 3 
        // Guessing game between 3 numbers (it should be hard coded), 
        // if you guess the number correctly then you win
        // if not then keep playing the game.

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int secret1 = 7;
        int secret2 = 13;
        int secret3 = 21;

        boolean hasWon = false;

        while (!hasWon) {
            System.out.print("Guess a number: ");
            int guess = scanner.nextInt();

            if (guess == secret1 || guess == secret2 || guess == secret3) {
                System.out.println("You win!");
                hasWon = true;
            } else {
                System.out.println("Wrong guess, try again.");
            }
        }

    }
}

