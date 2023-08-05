/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofish;

import gofish.Card.Suit;
import gofish.Card.Value;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author tenes
 */
public class Deck {

    //field variables
    protected ArrayList<Card> deck ;
//constructor
    public Deck(){
    this.deck =  new ArrayList<Card>();
    }

//Fill an array full of Cards of every value.
public void createDeck(){
     this.deck = new ArrayList<>();
        for(Suit cardSuit : Suit.values()){
            for(Value cardValue : Value.values()){
                this.deck.add(new Card(cardSuit, cardValue));
            }
        }
    }
    
    
  
    
    
       //remove method from ArrayList to remove the first card in the index
	public void removeCard(int i)
        {
        this.deck.remove(i);
        }
        //draws a card from the deck.
        public void drawCard()
        {
            this.deck.get(0);
        }
        //add a card to the deck MIGHT NOT BE USED.
        public void addCard(Card card){
        this.deck.add(card);
        }
        
        //show a card
        public void showCard(int i){
        this.deck.get(i);
        }
        //return size of the deck
        public int deckSize(){
            return this.deck.size();
        }
        //shows every card in the deck.
        public void showTheDeck(){
        
        for (Card card : deck)
        {
            System.out.println(card);
        }
        }
}