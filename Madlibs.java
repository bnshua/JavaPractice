import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter an adjective:");
        String adj1 = input.nextLine();

        System.out.println("Enter another adjective:");
        String adj2 = input.nextLine();

        System.out.println("Enter another another adjective:");
        String adj3 = input.nextLine();


        System.out.println("Enter a month (Between January-December (Must be the Gregorian Calender)):");
        String month = input.nextLine();


        System.out.println("Enter a number (0-35):");
        String day = input.nextLine();


        System.out.println("Enter a robotic name:");
        String name1 = input.nextLine();

        System.out.println("Enter a robotic surname:");
        String ln1 = input.nextLine();

        System.out.println("Enter a human-like name:");
        String name2 = input.nextLine();

        System.out.println("Enter a human-like ln:");
        String ln2 = input.nextLine();

        System.out.println("Synonym of chaotic:");
        String synChaotic = input.nextLine();

        System.out.println("Enter a verb ending in -ing:");
        String verb1 = input.nextLine();

        System.out.println("Enter cute pet name that you could use for Bernard Loquias:");
        String BernardName = input.nextLine();

        System.out.println("Enter a thing at weddings:");
        String weddingThingNoCap = input.nextLine();

        System.out.println("Enter a noun:");
        String animal = input.nextLine();

        System.out.println("Enter a certain emergency prevention mechanism installed in buildings (fire alarms, sprinklers, NOT SPRINKLES.):");
        String EDM = input.nextLine();

        System.out.println("Enter another verb ending in -ing:");
        String verb2 = input.nextLine();

        System.out.println("Enter 3-4 letter acronym (LOL, OMG, ROFL, ETC.):");
        String letter = input.nextLine();


        String story = "It was a " + adj1 + " and " + adj2 + " day. " + month + " " + day + ", 2025 was a day that " + name1 + "was sure to remember for years to come. " + name1 + " " + ln1 + " was finally getting married to " + name2 + " " + ln2 + ". It was the first Robot-Human marriage in human history. The ceremony began normally, but would soon turn " + synChaotic + ". Suddenly, a small " + animal + " named " + BernardName + ", who was extremely " + adj3 + " scurried out of the " + weddingThingNoCap + "and began " + verb1 + " all over the place. " + name1 +  " glitched out and caused the " + EDM + " to go off " + verb2 + " the cake and ruining the wedding. " + name1 + " exclaimed, " + letter + "!";

        System.out.println("\n--- Your Mad Lib Story ---\n");
        System.out.println(story);

    }
}























