/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chess.*;

/**
 *
 * @author HP
 */
public class Square {
   private int row ;
    private int coloumn;
    private char state; // b or w or f
    
    public Square(int row,int coloumn)
    {
        this.row = row;
        this.coloumn=coloumn;
       
    }
     public int getRow ()
                {
                   return row; 
                }
    public int getColoumn()
    {
        return coloumn;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColoumn(int coloumn) {
        this.coloumn = coloumn;
    }

    public void setState(char state) {
        this.state = state;
    }
    
    public char getState() {
        return state;
    }
    
    
}
