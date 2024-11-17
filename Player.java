package javaapp;

import java.util.Scanner;




/**
 *
 * @author one
 */
public class Player {
    Player(String _name, int _x, int _y)
    {
        name = _name;xPosition =_x;yPosition = _y;
        System.out.println(name + " entered the game");
        Data.players.add(this);
        for(Player player: Data.players){
            if(player == this){
                player.id = Data.players.indexOf(player);
            }
        }
    }
    int health = 10;
    int damage =1;
    int id = 0;
    
    String name;
    int xPosition;
    int yPosition;
    int kills;
    int range = 2;
    int speed;
    void Move(int x, int y)
    {
        xPosition += x;
        yPosition += y;
        System.out.println(name + " position is " + xPosition + " X " + yPosition + " Y");
    }
    
    void Attack()
    {
        for(Player player: Data.players)
        {
            int xDist = Math.abs(xPosition - player.xPosition);
            int yDist = Math.abs(yPosition - player.yPosition);
            if(!this.equals(player) && (xDist <= range && yDist <= range))
            {
                player.health--;
                System.out.println(player.name + " health is " + player.health);
            }
            else
            {
                System.out.println("Either the player is you or players are out of your range");
            }
        }
    }
    
    void Dodge(int x, int y)
    {
        xPosition += x;
        yPosition += y;
        System.out.println(name + " position is " + xPosition + " X " + yPosition + " Y");
    }
    
    
    
    
    public void Move(){
        /*for(int i = 0; i < yPosition; i++){
            System.out.print("\n");
        }
        
        
        for(int i = 0; i < xPosition; i++){
            System.out.print(" ");
        }
        System.out.print("P");*/
        
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        if(input.equals("d")){
            xPosition++;
        }
        else if (input.equals("a")){
            xPosition--;
        }
        else if (input.equals("w")){
        
            yPosition--;
        }
        else if (input.equals("s")){
        
            yPosition++;
        }
        
        }
        
        
    }

    

