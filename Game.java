/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;


/**
 *
 * @author one
 */
public class Game {
    public static void main(String[] args)
    {
        Player player_one = new Player("Trump", 0, 0);
        Player player_two = new Player("Halim", 1, 1);
        Player player_three = new Player("Mohi", 1, 1);
        Data.GetPlayers();
        player_one.Move(5, 5);
        player_two.Attack();
        
    }
}
