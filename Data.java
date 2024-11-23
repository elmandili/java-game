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
   
    
    static int size = 20;
    static char[][] arena = new char[size][size*2];
    static String[][] arenaString = new String[size][size];
    static void GetPlayers()
    {
        System.out.println("The players now are : ");
        for(int i = 0; i < players.size();i++)
        {
            System.out.println(players.get(i).name);
        }
    }
    
    
    public static void Grid(){
        for (int i=0; i < Data.arena.length  ; i++) {
            for (int j=0; j < Data.arena[i].length; j++) {
                
                
                
                
                if (i==0 || i== Data.arena.length - 1 || j==0 || j==Data.arena[i].length - 1) { 
                    
                    Data.arena[i][j] = '.';
                    
                    
                    
                }
                else {
                    //System.out.print("   ");
                    Data.arena[i][j] = ' ';
                    
                }
                    

            }
        System.out.print("\n");
        }
        
        
    
    }
    
    
    
    
    public static void UpdatePlayersPosition(){
        for(Player player: players){
            arena[player.yPosition][player.xPosition] = 'P';
            
            arena[player.yPosition+1][player.xPosition+1]='#';
            arena[player.yPosition-1][player.xPosition-1]='#';
            arena[player.yPosition+1][player.xPosition-1]='#';
            arena[player.yPosition-1][player.xPosition+1]='#';
            //X AXIS 
            arena[player.yPosition][player.xPosition+1]='#';
            arena[player.yPosition][player.xPosition-1]='#';
            arena[player.yPosition+1][player.xPosition]='#';
            arena[player.yPosition-1][player.xPosition]='#';
        }
        
    }
    static void PrintArena() {
        for(int i = 0;i < arena.length;i++)
        {
            for(int j = 0; j < arena[i].length; j++)
            {
                System.out.print(arena[i][j]);
            }
            System.out.print('\n');
        }
        
    }
    
    static void Test(){
         // Array Intialised and Assigned
        char[][] arr = new char[10][20];
        
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
                if(i == 0 || j == 0 || j == arr[i].length - 1 || i == arr.length - 1){
                    arr[i][j] = '.';
                }
                else{
                    arr[i][j] = ' ';
                }
              
        }
        
        //Place Player in an index 
        arr[5][10] = 'P';

          // Printing the Array
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j]);
              System.out.println();
        }
    }
}
