/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofish;



/**
 *
 * @author tenes
 */
public class Hand extends Deck{
   
    //This method will add a copy of the card from the deck at index 0 to your hand
    //Then proceed to delete it.
    
    //draw a card from 1 deck and add it to another (hand)
    @Override
 public void draw(Deck draw)
 {
 this.deck.add(draw.getCard(0));
 draw.removeCard(0);
 }
 
 @Override
 public void removeCard(int i)
 {
 this.deck.remove(i);
 }
 
 @Override
 public Card getCard(int i)
 
 {
     return this.deck.get(i);
 }
 @Override
 public void addCard(Card card)
 {
 this.deck.add(card);
 }
 @Override
 public void showTheDeck()
 {
     for(Card card : deck)
     {
         System.out.println(card);
     }
 }
 //Work on this next time.
 public void fillHand(Deck draw)
 {
     for(int  i = 0; i<7 ; i++ ){
 this.deck.add(draw.getCard(0));
 draw.removeCard(0);
 }
}

}