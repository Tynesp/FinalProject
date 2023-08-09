/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofish;

/**
 *
 * @author tenes
 */
public class Player {

    private String name;
    int books = 0;

    public void player(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setBooks(int books)
    {
    this.books = books;
    }
    public int getBooks()
    {
        System.out.println("You have " + books + " books");
        return books;
    }
    //adds a book which are linked to winning the game.
    public int addBooks()
    {
        return ++books;
    }
    public String toString(){
    return "Player: " + name + " Books: " + books;
    }
}
