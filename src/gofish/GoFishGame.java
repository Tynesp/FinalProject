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
        //establish the variables
        //creates an empty deck
      Deck cards = new Deck();
      //creates an empty hand
      Hand myHand = new Hand();
      //creates an empty hand
      Hand AIHand = new Hand();
      //creates a Player to keep track of his score
      Player Tim = new Player();
      //take player name input TODO
      Tim.setName("Tim");
      //do the same for the computer player
      Player AI = new Player();
      AI.setName("AI");
        //need this to use the methods
      GoFish game = new GoFish();
      //games starts by printing the rules of the game. 
        System.out.println("These are the rules of the games");
      //fill the deck
      cards.createDeck();
      //fill the hands
      myHand.fillHand(cards);
      AIHand.fillHand(cards);
      
      
      ///////METHODS REQUIRED FOR A WORKING GAME/////
      ///////ALSO THE NATURAL FLOW OF THE GAME///////
      
      
      //check opening hand for books - this required a method to see if the opening hand has any duplicates.
      
      //if player has duplicates they will gain +1 book for each one here.
      //else
      
      //AI checks hand for duplicates - use same method as above to do this
      //if ai has duplicates they get +1 book
      //else
      
      //proceed
      
      
      //ask opponent for card - this requires a method
      //you'll need to allow the player to choose a card from there hand and compare it to every card in opponents hand
      
      //display the users hand for user choice
      
      //check opponents hand
      
      //if found earn a book and ask again
      
      //if not found you go fish. - this method can just be the card draw method with some flavor text
      myHand.draw(cards);
      
      //check your hand again for a book. -- possibly use the check for book method again.
      
      //**IMPORTANT**//
      //Every time the player or computer makes a book, they need to have a counter that is something like this
      // if (tim.getBooks >= 3){You win!}
      // else {continue playing}
      //The AI will also need this to be checked except
      // if  (AI.getBooks>= 3){GAMEOVER}
      
      //---------------------------------------
      //No repeat this process again for the computer, essentially follow the exact same steps as the human player
      //except they won't choose the card they'll just always compare the card at index 0
      // I believe this should all be in a while loop with a condition of if !gameover continue or something like that
      //regardless we'll have to keep going through this whole process until 1 player gets 3 books total.
      
     
    
       
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      /*
      
      Don't Delete this. All these tests are important to reference.
      */
     // cards.createDeck();
     // cards.shuffle();
      //drawing methods work
      //myHand.fillHand(cards);
      //yourHand.fillHand(cards);
     
   
      
       // System.out.println("this is the deck");
      //cards.showTheDeck();
       // System.out.println("this is my hand");
      //myHand.showTheDeck();
        //System.out.println("this is the opponents hand.");
     // yourHand.showTheDeck();
       // System.out.println("this is the size of your hand");
       // System.out.println(myHand.deckSize());
      //  myHand.fillHand(cards);
      //  
      //  System.out.println("this is your hand now");
      //  myHand.showTheDeck();
       // System.out.println("this is the size of your hand");
       // System.out.println(myHand.deckSize());
       // System.out.println(cards.deckSize());
       
        
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
    
    
        
    