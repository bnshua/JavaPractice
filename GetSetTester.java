

import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GetSet player2 = new GetSet();
        GetSet player1 = new GetSet();

        System.out.println(player1.getUsername()); 
        player1.setUsername("pineappleghost333");
        System.out.println(player1.getUsername());        

        System.out.println(player2.getUsername()); 
        player2.setUsername("TPUSAFan1776");
        System.out.println(player2.getUsername());  
  
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ")
        String user = input.nextLine();
        player3.setUsername(userInput);
        System.out.println(player3.getUsername());
//challenge 1
        GetSet ID = new GetSet();
        System.out.print("Enter your ID number: ")
        String ID = input.nextLine();
        ID.setID = input.nextLine(userInput);
        System.out.println(ID.getID());

        GetSet rank = new GetSet();
        System.out.print("Enter rank (Tyler Ondovik (Novice), Christian Bozzo (Mediocre), Carlucci 'Rocks' Carlucci (Good), Joshua Risbon (Genius Level), Gavyn (Pro level): ");
        String rank = input.nextLine();
        rank.setRank = input.nextLine(userInput);
        System.out.println(rank.getRank());
        if (rank = "Tyler Ondovik"){
            System.out.println("You are the king of AI!");
        } else if (rank = "Christian Bozzo") {
            System.out.println("You are the king of linguistics, and you really like Europe and Catholicism.....");
        } else if (rank = "Carlucci 'Rocks' Carlucci"){
            System.out.println("You are a genius! You are so unbelievably smart!");
        } else if (rank = "Joshua Risbon"){
            "You're a genius like Carlucci. Great choice!"
        } else if (rank = "Gavyn Rayeski") {
            "You are the bringer of famine and destruction. Spectacular choice!"
        }


    }
}
class GetSet{
    private String username = "No user name";
    private String ID = "No ID";
    private String rank = "No rank";
    public String getUsername(){
        return username;
    }
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    public int getID(){
        return ID;
    }
    public void setID(String newID){
        this.ID = newID
    }
    public String rank(){
        return rank;
    }
    public void setRank(){
        this.rank = newRank
    }

}