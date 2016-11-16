/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock_sizers_paper;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author polina.garmas
 */
public class Rock_sizers_paper {
    enum Item {Rock, Paper, Sizers};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item playerItem = Item.Paper;
        Item madeupItem = Item.Paper;
        
        while (true) {            
            

        // AI picks up his own Item 
        Random random = new Random();
        int picked=random.nextInt(2);
        if (picked==0) {
           madeupItem= Item.Paper;
        }
        if (picked==1) {
            madeupItem= Item.Rock;
        }
        if (picked==2) {
            madeupItem= Item.Sizers;
        }

        // Player enters choosed Item
        System.out.println("Choose your Item: ");
        
        System.out.println("1 - for Paper");
        
        System.out.println("2 - for Rock");
        
        System.out.println("3 - for Sizers");
        
        Scanner sn = new Scanner(System.in);
        int pick = sn.nextInt();
        
        if (pick==1) {
            playerItem= Item.Paper;
        }
        if (pick==2) {
        playerItem= Item.Rock;
        }
        if (pick==3) {
        playerItem= Item.Sizers;
        }
        //
        System.out.println("YOU have picked: "+playerItem.toString());
        System.out.println("I have picked: "+madeupItem.toString());
        
        // We will identify winner
        if (playerItem==madeupItem) {
            System.out.println("PUSH, try again.");
        } else{
            if (playerItem==Item.Rock&&madeupItem==Item.Sizers) System.out.println("You have won!");
            if (playerItem==Item.Paper&&madeupItem==Item.Rock) System.out.println("You have won!");
            if (playerItem==Item.Sizers&&madeupItem==Item.Paper) System.out.println("You have won!");
            
            if (playerItem==Item.Sizers&&madeupItem==Item.Rock) System.out.println("You loose");
            if (playerItem==Item.Rock&&madeupItem==Item.Paper) System.out.println("You loose");
            if (playerItem==Item.Paper&&madeupItem==Item.Sizers) System.out.println("You loose");
                    
            }
        }
        
                }


}
