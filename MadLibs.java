import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for each required word
        System.out.println("Enter a name:");
        String name1 = input.nextLine();

        System.out.println("Enter a number (feet tall):");
        String numberFeet = input.nextLine();

        System.out.println("Enter a single digit number:");
        String singleDigit = input.nextLine();

        System.out.println("Enter a movement verb ending in 's':");
        String movementVerb = input.nextLine();

        System.out.println("Enter a place:");
        String place = input.nextLine();

        System.out.println("Enter an animal:");
        String animal = input.nextLine();

        System.out.println("Enter a food a robot would eat:");
        String robotFood = input.nextLine();

        System.out.println("Enter a type of relationship (e.g. friend, sister):");
        String relationship1 = input.nextLine();

        System.out.println("Pick one: dumber or smarter:");
        String smartOrDumb = input.nextLine();

        System.out.println("Enter a plural object:");
        String objectsPlural = input.nextLine();

        System.out.println("Enter a rival of Wendy's:");
        String rivalRestaurant = input.nextLine();

        System.out.println("Enter a way of expressing anger (past tense):");
        String angerVerb = input.nextLine();

        System.out.println("Enter a farewell:");
        String farewell = input.nextLine();

        System.out.println("Enter another way to say 'said':");
        String saidSynonym = input.nextLine();

        System.out.println("Enter an adjective describing someone's life:");
        String lifeAdjective = input.nextLine();

        System.out.println("Enter a type of relationship (plural):");
        String relationshipsPlural = input.nextLine();

        System.out.println("Enter a pronoun:");
        String pronoun = input.nextLine();

        // Build the Mad Lib paragraph
        String story = "Tyler has an AI wife named " + name1 + ". His wife is " + numberFeet +
                " feet tall and has " + singleDigit + " arms. Every now and then, he takes long " +
                movementVerb + " in the " + place + ". His AI girlfriend is a complete recreation of a " +
                animal + ". Her favorite food is " + robotFood + ". Christian Bozzo is the " +
                relationship1 + " of Tyler and is related to Christopher Carlucci, who is " +
                smartOrDumb + " than a bag of " + objectsPlural + ". When Christian Bozzo and Christopher Carlucci went to the " +
                rivalRestaurant + ", Tyler " + angerVerb + ". \"" + farewell + ",\" " +
                saidSynonym + " Tyler Ondovik-GPT. That is all about the " + lifeAdjective +
                " life of Tyler Ondovik-GPT. Would you be " + relationshipsPlural +
                " with " + pronoun + "?";

        // Print final story
        System.out.println("\n--- Your Mad Lib Story ---\n");
        System.out.println(story);
    }
}
