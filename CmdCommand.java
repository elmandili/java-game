/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import java.io.IOException;

/**
 *
 * @author one
 */
public class CmdCommand {
    public static int size = 5;
    public static void main(String[] args) {
        
        Player pone = new Player("Trump", 5, 5);
        Player ptwo = new Player("MOHI", 8, 8);
        
        // Simulate a loop that prints something
        while(true) {
            try {
                // Clear the terminal screen using 'cls' on Windows
                if (System.getProperty("os.name").toLowerCase().contains("win")) {
                    // Run the 'cls' command to clear the terminal
                    ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls");
                    processBuilder.inheritIO();  // Inherit the IO so the output is visible in the terminal
                    processBuilder.start().waitFor();
                } else {
                    // For Linux/macOS, use 'clear'
                    ProcessBuilder processBuilder = new ProcessBuilder("clear");
                    processBuilder.inheritIO();
                    processBuilder.start().waitFor();
                }

                // Simulate some work being done
                //System.out.println("Iteration " + (i + 1));
                
                  // Size of the square

                Data.Grid();
                Data.UpdatePlayersPosition();
                Data.PrintArena();
                pone.Move();
                ptwo.Move();
                
                //Data.Test();
                
                size++;
                // Wait for a short time before clearing again (optional)
                Thread.sleep(500); // 1 second FPS Frames Per Second

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
