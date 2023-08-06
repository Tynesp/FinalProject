/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofish;

/**
 *
 * @author tenes
 */
//this where the game will be played. Or where you can test your methods
public class GoFishGame {
    public static void main(String[] args) {
        
      Deck cards = new Deck();
      Hand myHand = new Hand();
      Hand yourHand = new Hand();
      cards.createDeck();
     Player Tim = new Player();
       
      /*
      
      Don't Delete this. All these tests are important to reference.
      */
      cards.createDeck();
      cards.shuffle();
      //drawing methods work
      myHand.draw(cards);
      yourHand.draw(cards);
      
       // System.out.println("this is the deck");
      //cards.showTheDeck();
        System.out.println("this is my hand");
      myHand.showTheDeck();
        System.out.println("this is the opponents hand.");
      yourHand.showTheDeck();
        System.out.println("this is the size of your hand");
        System.out.println(myHand.deckSize());
        myHand.fillHand(cards);
        
        System.out.println("this is your hand now");
        myHand.showTheDeck();
        System.out.println("this is the size of your hand");
        System.out.println(myHand.deckSize());
        System.out.println(cards.deckSize());
        
      // hand.draw(cards);
      //  System.out.println("This is the hand you have.");
     //  hand.showTheDeck();
      //  System.out.println("This is the rest of the deck.");
     //  cards.showTheDeck();
    //cards.shuffle();
    
    //cards.showTheDeck();
     //Tim.getBooks();
     //Tim.addBooks();
     //Tim.getBooks();
     
     ///////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////
     
         
     }
    
    }
    
    
        
    