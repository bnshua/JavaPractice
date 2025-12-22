import java.util.*;

public class main {
    public static void main(String[] args) {
        String name;

        System.out.println("Enter your Character's first name:");
        Scanner in = new Scanner(System.in);
        name = in.nextLine() + " Caesar";

        System.out.println("You are " + name + ", a Roman general who is engaged in a brutal civil war against Pompey the Great for control of Rome. It is 49 BC, and Pompey controls a much larger army than your own. Your leegions are divided, and the Adriatic Sea separates you from Italy. Now you must choose whether or not to risk a dangerous crossing and strike first, or wait for more favorable conditions.");

        System.out.println("There are two generals under your command with varying opinions on the situation. General Flynn believes that it would be best to cross the Adriatic in the winter to capture Pompey in a surprise attack. General Decktor believes that it is best to wait until summer for safer naval passage. You are the head of the army, who do you side with? FLYNN or DECKTOR?");
        if (in.nextLine().equals("FLYNN")) {
            System.out.println("You decide that a winter attack is the best course of action. Despite the threat of facing a much stronger army, you and your men launch your naval attack on Pompey. After he is found, you catch him off guard and, using your naval militia, you harrass Pompey and now you're faced with an even bigger decision than the last. You must either engage immediately or choose to withdrawal, take some time, get materials, and come back. Pompey is in a much better position than you are and it is likely he could destroy you and your naval fleet, but if you leave for even a small amount of time, he could gain more power as well or even flee like he did prior. Do you choose to ATTACK or RESUPPLY?");
            if (in.nextLine().equals("RESUPPLY")) {
                System.out.println("Congratulations! You captured Pompey! You now have two options. Kill Pompey or let him flee to Egypt (Where you know he will be assassinated. Do you chose KILL or FLEE");
                if (in.nextLine().equals("KILL")) {
                    System.out.println("You chose to kill Pompey to reassert yourself as dictator. It caused great outrage as you have violated your biggest policy, clementia (showing mercy). Everyone now sees you as a cruel and malicious dictator. You are overthrown and eventually executed by the Senate. Your son doesn't go on to become emperor and your family lineage ends.");
                } else {
                    System.out.println("You chose to show clementia and let Pompey escape to Egypt where he is eventually killed. You have taken down Pompey and his troops succesfully. Your best friend Marcus Junius Brutus and Gaius Cassius Longinus, your friends, ask to have a polite chat over coffee! You're unbelievably excited! Do you GO or REJECT the offer?");
                    if (in.nextLine().equals("GO")) {
                        System.out.println("You go have coffee with him at the Senate. As you ascend the steps of the Theatre of Pompey on the Ides of March, you ignore the unsettling omens and the frantic warnings of those attempting to hand you petitions. You take your seat at the Senate session, only to be surrounded by men you once pardoned, their faces masks of feigned supplication. The air grows cold as Tillius Cimber pulls the robe from your shoulders, signaling the first strike from Cascas dagger that grazes your neck. You fight back with desperate strength, but soon the blades of your colleagues rain down from every angle, turning your toga crimson with twenty-three wounds. When you lock eyes with Marcus Brutus, the protégé you treated like a son, your will to resist finally shatters; you cover your face with your mantle, whisper your final words of betrayal, and collapse at the base of your rival Pompeys statue, leaving your life and the Roman Republic to bleed out on the marble floor. ");
                    } else {
                        System.out.println("You wake that morning and choose not to go to the Senate, and in doing so you expose how little the old Republic truly matters anymore; having survived, you stop pretending that shared governance can restrain ambition, and you consolidate power openly, sidelining Republican traditions while purging the Senate of those who oppose you, exiling or eliminating rivals and filling the chamber with loyalists whose status depends entirely on your favor, turning what was once a deliberative body into a rubber-stamp institution that preserves the appearance of legality while all real authority flows through you as dictator for life.");
                    }
                }
            } else {
                System.out.println("You chose to attack, but Pompey's men severely overpowered you. He was in a better position and had more supplies. He kills you and then does a little italic jig. :( ");
            }
        } else {
            System.out.println("Summer has arrived! Joy is the day! Everyone has smiles on their faces and you have a new and rejuvinated youthful crew. They are all prepared to launch the attack. After crossing the Adriatic Sea, looking everywhere, and searching even the smallest nooks and crannies, you find that Pompey's naval superiority has all but strengthened. Pompey has reclaimed Italy and has now painted you as a public enemy of the Roman State. He and his men capture you and bring you to Rome for a show trial where they eventually decide to execute you for treason.");
        }
    }
}