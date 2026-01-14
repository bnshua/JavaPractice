import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {

        double[] scores = new double[5];
        double sum = 0.0;
        double avg;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your five test scores (each out of 100):");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = keyboard.nextDouble();
            sum += scores[i];        
        }

        avg = sum / scores.length;       

        System.out.println("Average score: " + avg);

        keyboard.close();
    }
}
