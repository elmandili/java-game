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
        
        switch (input) {
           case "d" -> {
               if(xPosition+1 == Data.arena[0].length-2 || isCollide(2, 0)) {
                   System.out.println("Collided from right!");
               }
               else { xPosition++; }
            }
               
           case "a" -> {
               if (xPosition-1 == 1 || isCollide(-2, 0) ){
                   System.out.println("Collided from left!");
               }
               else { xPosition--;}
            }
           
           case "w" -> {
               if(yPosition-1 == 1 || isCollide(0, -2) ){
                System.out.println("Collided on top!");
            }
               else { yPosition--;}
           }
           
           case "s" -> {
               if(yPosition+1 == Data.arena.length-2 || isCollide(0, 2)){
                System.out.println("Collided on bottom!");
            }
               else { yPosition++;}
           }
           
           default -> {System.out.println("Invalid input!");}
       
       }
        
       /* if(input.equals("d")){
            if(xPosition+1 == Data.arena[0].length-2 || (isCollide(2, 0))) {
                System.out.println("Collided from right!");
                //return;
            }
            else {
                xPosition++;
            }
        }
        else if (input.equals("a")){
            if(xPosition-1 == 1 || (isCollide(-2, 0))){
                System.out.println("Collided from left!");
                return;
            }
            else {
                xPosition--;
            }
        }
        else if (input.equals("w")){
            if(yPosition-1 == 1 || (isCollide(0, -2))){
                System.out.println("Collided on top!");
                return;
            }
            else {
            yPosition--;
            }
        }
        else if (input.equals("s")){ 
            if(yPosition+1 == Data.arena.length-2 || isCollide(0, 2)){
                System.out.println("Collided on bottom!");
                return;
            }
            else {
            yPosition++;
            }
        } */
        
        } 
    
    public boolean isCollide(int xOffset, int yOffset) {
        for (Player player: Data.players){
            
            if (player != this) {
                int xdist = player.xPosition - (xPosition+xOffset);
                int ydist = player.yPosition - (yPosition+yOffset);
                double distance = Math.sqrt( Math.pow(xdist, 2) + Math.pow(ydist, 2) );
                
                if ( distance < 2 ) {
                    return true;
                }
          
            /*if (xPosition + xOffset == player.xPosition && yPosition + yOffset == player.yPosition) {           
                return true;}*/
            }
        }
        return false; 
    }
}