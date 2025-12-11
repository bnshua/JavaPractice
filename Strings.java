public class Strings {
    public static void main(String[] args) {
        String nameObj = new String("Didi");
        String name1 = "Didi";
        String name2 = "Gogo";
        String name3 = "Gogo";

        System.out.println("name1 and name2 reference-equal? " + (name1 == name2));
        System.out.println("name2 and name3 reference-equal? " + (name2 == name3));
        System.out.println("name1 equals nameObj? " + name1.equals(nameObj));

        System.out.println("Compare name1 to name3: " + name1.compareTo(name3));
        System.out.println("# of chars in name1: " + name1.length());
        System.out.println("Index of 'o' in name2: " + name2.indexOf("o"));

        String quote = "talk is cheap, show me the code.";
        String result1 = quote.substring(15);

        System.out.println("full quote: " + quote);
        System.out.println("Substring from index 15: " + result1);
    }
}
