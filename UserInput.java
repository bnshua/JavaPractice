import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        String age = input.nextLine();

        int ageConverted = Integer.parseInt(age);
        System.out.println("Next year " + name + " will be: " + (ageConverted + 1));

        System.out.println("What is your height in meters?");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("You are " + height + " meters tall.");

        // Challenge 1: Email generator
        System.out.println("Enter your first word:");
        String word1 = input.nextLine();

        System.out.println("Enter your second word:");
        String word2 = input.nextLine();

        System.out.println("Enter number 1:");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter number 2:");
        int num2 = Integer.parseInt(input.nextLine());

        int finalNum = (num1 + num2) % 100;

        String email = word1 + word2 + finalNum + "@csaea.com";
        System.out.println("Generated email: " + email);

  
        System.out.println("Enter a number to divide:");
        double firstDouble = Double.parseDouble(input.nextLine());

        System.out.println("Enter another number to divide by:");
        double secondDouble = Double.parseDouble(input.nextLine());

        double result = firstDouble / secondDouble;
        System.out.println("Result: " + result);

   
        System.out.println("Enter the diameter of a circle:");
        double diameter = Double.parseDouble(input.nextLine());

        double radius = diameter / 2.0;
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
