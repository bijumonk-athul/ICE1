/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Athul Bijumon Kolothu
 * 991724395
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int) (Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); 
            magicHand[i] = c;
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
        
        //Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter a Value from 1-13 :");
        // int V1 = sc.nextInt();
        // System.out.print("Enter a Suit (0-3 where 0=Hearts,1=Diamond,2=Spades,3=Clubs): ");
        // int suitIndex = sc.nextInt();
        // String S1 = Card.SUITS[suitIndex]; 
        
        // Card c1 = new Card();
        // c1.setValue(V1);
        // c1.setSuit(S1);
        
         boolean usercard = false;
        // for (Card C : magicHand) {
        //     if (C.getValue() == c1.getValue() && C.getSuit().equals(c1.getSuit())) {
        //         usercard = true;
        //         break;
        //     }
        // }

        Card luckcard = new Card();
        luckcard.setValue(2);
        luckcard.setSuit("Clubs");
        for (Card C : magicHand){
                if (C.getValue() == luckcard.getValue() && C.getSuit().equals(luckcard.getSuit())){
                usercard = true;
                break;
                }
        }
        
         if (usercard==true){
             System.out.println("Your Assumption is Correct");
         }
         else{
             System.out.println("Sorry,Your Assumption is Incorrect");
         }
         
    
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
