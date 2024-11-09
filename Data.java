package javaapp;
import java.util.ArrayList;

/**
 *
 * @author c3
 */
public class Data {
    static int round;
    static Player winner;
    static ArrayList<Player> players = new ArrayList<>();
    static void GetPlayers()
    {
        System.out.println("The players now are : ");
        for(int i = 0; i < players.size();i++)
        {
            System.out.println(players.get(i).name);
        }
    }
}
