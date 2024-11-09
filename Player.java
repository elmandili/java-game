package javaapp;



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
    }
    int health = 10;
    int damage =1;
    String name;
    int xPosition;
    int yPosition;
    int kills;
    int range = 2;
    
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
    
    
    
}
