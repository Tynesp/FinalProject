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
    protected ArrayList<Card> deck = new ArrayList();
//constructor
    public Deck(){
    this.deck =  new ArrayList<Card>();
    }

//Fill an array full of Cards of every value.
public void createDeck(){
    ArrayList<Card> deck = new ArrayList();
    for(Suit suit : Suit.values()){
        for(Value value : Value.values()){
            deck.add( new Card(value, suit));
    }
    }
    for(Card card : deck){
        System.out.println(card);
    }
    }
       //remove method from ArrayList to remove the first card in the index
	public void removeCard(int i){
        
        this.deck.remove(0);
        }
        //draws a card from the deck.
        public void drawCard(){
        
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
}
