/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofish;

/**
 *
 * @author tenes
 */
public class GoFishGame {
    public static void main(String[] args) {
        
        
        Deck deck = new Deck();
        
        deck.createDeck();
            
        System.out.println(deck.showCard(0).toString());
    
    }
        
    }